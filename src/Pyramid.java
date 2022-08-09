public class Pyramid {
    public static void main(String[] args){
        int m = 25 ; //Row
        double n = (m/2)+1 ; //Mid point
        for(int i = 1 ; i <= m ; i++){
            for(double j = 1 ; j <= m ; j++){
                //      point             Left wall                   Right wall             Base
                if((i==1 && j == n) || (i>1 && j == n - i + 1) || (i>1 && j == n + i - 1) || i == n){
                    System.out.print("* ") ;
                }else{
                    System.out.print("  ") ;
                }
            }
            System.out.println() ;
        }
    }
}
