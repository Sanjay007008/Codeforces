import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ; 

        String a = sc.next() ;
        String b = sc.next() ; 
        int c=0 ; 

        for(int i=0 ; i<a.length() ; i++)
        {
            char v1 = Character.toUpperCase(a.charAt(i)) ; 
            char v2 = Character.toUpperCase(b.charAt(i)) ; 
            if(v1 != v2)
            {
                if(v1 < v2)
                {
                    System.out.println(-1);
                    return ; 
                }
                else if(v1 > v2){
                    System.out.println(1);
                    return ; 
                }
                // System.out.println(c);
            }
        }

        System.out.println(0);
    }
}
