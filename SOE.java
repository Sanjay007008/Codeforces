import java.util.ArrayList;
import java.util.Scanner;

public class SOE {
        static int[] SOEFun(int num)
        {
            int arr[] = new int[num+1] ; 
            for(int i=0 ; i<=num ; i++)
            {
                arr[i] = 1 ; 
            }
            arr[0] = 0;
            arr[1] = 0;
            
            for(int i=2 ; i<=num ; i++)
            {
                if(arr[i] == 1)
                {
                    for(int j = i * 2 ; j <= num ; j += i)
                    {
                        arr[j] = 0 ; 
                    }
                }
            }


            return arr ; 
        }
         public static void main(String[] args) {
            Scanner sc  =  new Scanner(System.in) ; 
            int val = sc.nextInt() ; 


            int prime[] = SOEFun(val) ; 

            ArrayList<Integer> arr = new ArrayList<>() ; 

            for(int i=2 ; i< prime.length ; i++)
            {
                if(prime[i] == 1)
                {
                    arr.add(i)  ;
                }
            }


            System.out.println(arr.size());
            for(int i=0 ; i<arr.size(); i++)
            {
                System.out.print(arr.get(i) + " ");
            }
         }   
}
