import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        int n ; 
        Scanner sc =  new Scanner(System.in) ; 
        n = sc.nextInt() ; 


        int arr[] = new int[n] ;  

        for(int i=0 ; i<n ;i++)
        {
            int v = sc.nextInt()  ; 
            arr[i] = v ; 

        }
        int a  = sc.nextInt() ; 
        int b = sc.nextInt() ; 
        int c = 0 ; 
        for(int i=a ; i<=b ; i++)
        {
            c += arr[i] ; 
        }

        System.out.print(c);
    }
}
