import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        int t ; 
        Scanner sc =  new Scanner(System.in) ; 
        t = sc.nextInt() ; 


        
        // t = sc.nextInt() ; 
        while(t > 0)
        {
            String str = sc.next() ; 
            if(str.length() > 10)
            {
                char a = str.charAt(0)  ;
                char b = str.charAt(str.length()-1 ) ; 

                StringBuilder s = new StringBuilder() ; 
                s.append(a) ;
                String num = Integer.toString(str.length()-2) ; 
                s.append(num) ; 
                s.append(str.charAt(str.length()-1)) ; 

                System.out.println(s);
            }
            else{
                System.out.println(str);
            }
            t-- ; 
        }
    }
}
