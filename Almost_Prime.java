import java.util.Scanner;

public class Almost_Prime {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt() ; 
        int c = 0 ; 

        for(int i=1 ; i<= t ; i++)
        {
            if(t%i == 0 && fun(i))
            {
                c++ ; 
            }

        }

        
    }
    
}
