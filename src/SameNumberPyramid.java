import java.util.Scanner;

public class SameNumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int count = 1 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n+i ; j++){
                if(j >= n-i-1){
                    System.out.print(count + " ") ;
                }else{
                    System.out.print("  ") ;
                }
            }
            count++ ;
            System.out.println("");
        }
    }
}
