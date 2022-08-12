import java.util.Scanner;

// Only for odd numbers

public class PyramidMirror {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int m = sc.nextInt() ;
        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= m ; j++){
                if(i <= m/2){
                    if(j <= m/2-i-1 || j >= m/2+i+1){
                        System.out.print("  ") ;
                    }else{
                        System.out.print("* ") ;
                    }
                }else{
                    if(j < i - m/2 || j > m - (i - m/2)){
                        System.out.print("  ") ;
                    }else{
                        System.out.print("* ") ;
                    }
                }
            }
            System.out.println("k");
        }
    }
}
