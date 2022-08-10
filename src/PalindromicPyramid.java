import java.util.Scanner;

public class PalindromicPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n+i ; j++){
                if(j >= n - 1 -i){
                    if(j < n){
                        System.out.print(n-j + " ") ;
                    }else{
                        System.out.print(j - n + 2 + " ") ;
                    }
                }else{
                    System.out.print("  ") ;
                }
            }
            System.out.println("") ;
        }
    }
}
