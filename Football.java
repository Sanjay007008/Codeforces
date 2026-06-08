import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in) ; 
        String str =  sc.next() ; 
        
        int maxi = 0 ; 
        int c = 0 ; 
        for(int i=0  ;i<str.length() ; i++)
        {
            if(str.charAt(i) == '1')
            {
                c++ ; 
                maxi =  Math.max(c , maxi) ; 
            }
            else{
                c=0;
            }
        }
                maxi =  Math.max(c , maxi) ; 


        if(maxi >= 7)
        {
            System.out.println("YES");
            return ; 
        }

         maxi = 0 ; 
         c = 0 ; 
        for(int i=0  ;i<str.length() ; i++)
        {
            if(str.charAt(i) == '0')
            {
                c++ ; 
                maxi =  Math.max(c , maxi) ; 
                // System.out.println(c);
            }
            else{
                c=0;
            }
        }
                maxi =  Math.max(c , maxi) ; 
        
        if(maxi >= 7)
        {
            System.out.println("YES");
           
        }
        else{
            // System.out.println(c);
            System.out.println("NO");
        }

    }
}
