public class backtrackingSubsets {
    public static void subsets(String str,int i,String ans){
        if(i==str.length()){
          if(ans.length()==0){
            System.out.println("null");
          }else{
            System.out.println(ans);
          }
          return;
        }

        //yes choice
        subsets(str,i+1,ans+str.charAt(i));
        //no choice
        subsets(str,i+1,ans);
    }
    public static void main(String args[]){
        String str="abc";
        subsets(str,0,"");

    }
    
}
