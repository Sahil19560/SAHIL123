public class optimizedOfBinaryOfN {
    public static int optimized(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimized(x,n/2);
        int halfPowerSq=halfPower*halfPower;
        //n is odd
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
           System.out.println(optimized(2,5));
    }
    
}
