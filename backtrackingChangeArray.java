public class backtrackingChangeArray {
    public static void changeArray(int arr[],int val,int i){
        if(i==arr.length){
            printArray(arr);
            return;
        }
        arr[i]=val;
        changeArray(arr,val+1,i+1);
        arr[i]=arr[i]-2;

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
            int arr[]={1,2,3,4,5};
            changeArray(arr,1,0);
            System.out.println();
            printArray(arr);
    }
    
}
