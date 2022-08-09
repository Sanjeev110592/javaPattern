public class ReverseTopBaseTriangle {
    public static void main(String[] args){
        int m = 10 ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i == 0 || j == 0 || j == m-i-1){
                    System.out.print("* ") ;
                }else{
                    System.out.print("  ") ;
                }
            }
            System.out.println() ;
        }
    }
}
