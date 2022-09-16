import java.util.ArrayList;
public class containerWithMostWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int rP=height.size()-1;
        int lP=0;
        // for(int i=0;i<height.size();i++){
            // for(int j=1;j<height.size();j++){
                while(lP<rP){
                   int minHgt=Math.min(height.get(lP),height.get(rP));
                   int width=rP-lP;
                   int area=minHgt*width;
                   maxWater=Math.max(area,maxWater);
                   if(lP<rP){
                    lP++;
                   }else{
                    rP--;
                   }
            }
            return maxWater;
        // int maxWater=0;
        // for(int i=0;i<height.size();i++){
        //     for(int j=1;j<height.size();j++){
        //            int minHgt=Math.min(height.get(i),height.get(j));
        //            int width=j-i;
        //            int area=minHgt*width;
        //            maxWater=Math.max(area,maxWater);
        //     }
        // }
        // return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
      
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
    
}
