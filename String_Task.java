import java.util.Scanner;

public class String_Task {
    public static boolean SEARCH(char arr[] , char c)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == c)
            {
                return true ;
            }
        }
        return false;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        String str = sc.next() ; 

        char arr[] = {'a' , 'o' , 'y' , 'e' , 'u' , 'i'} ; 

        StringBuilder ans  =  new StringBuilder() ;
        ans.append('.') ; 

        for(int i=0; i<str.length(); i++)
        {
            if(SEARCH(arr,Character.toLowerCase(str.charAt(i))) == false)
            {
                char temp = Character.toLowerCase(str.charAt(i)) ; 
                ans.append(temp) ; 
                ans.append('.') ; 

            }
        }

        ans.deleteCharAt(ans.length()-1) ; 

        System.out.println(ans);
    }
}
