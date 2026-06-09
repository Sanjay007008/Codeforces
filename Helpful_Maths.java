import java.util.* ; 
public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str =  sc.next() ; 

        Map<Character,Integer> map = new TreeMap<>() ; 

        for(int i=0 ; i<str.length() ; i++)
        {
            if(str.charAt(i) != '+')
            {
                map.put(str.charAt(i) , map.getOrDefault(str.charAt(i) , 0) + 1) ; 
            }
        }

        StringBuilder ans =  new StringBuilder() ; 

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            char key = entry.getKey() ; 
            int val = entry.getValue() ; 

            for(int i=1 ; i<= val ; i++)
            {
                ans.append(key) ; 
                ans.append('+') ; 
            }
        }

        ans.deleteCharAt(ans.length()-1) ; 

        System.out.println(ans);


    }
}
