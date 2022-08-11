import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int m = sc.nextInt() ;
        int n = sc.nextInt() ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m+n-1 ; j++){
                if((i == 0 && j>= m-1)|| (i == m-1 && j<n) || j == m-1-i || j == m+n-i-2){
                    System.out.print("* ") ;
                }else{
                    System.out.print("  ") ;
                }
            }
            System.out.println("") ;
        }
    }
}
