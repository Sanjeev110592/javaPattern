public class NumberTriangle {
    public static void main(String[] args){
        int n = 5 ;
        int count = 1 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(count++ + " ") ;
            }
            System.out.println() ;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(count++ + " ") ;
        }
    }
}
