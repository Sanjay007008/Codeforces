import java.util.* ; 
public class Euclid_Sequence_and_Two_Numbers {
    public static void reverse(int arr[])
    {
        int l = 0 ; 
        int r = arr.length -1  ; 
        while(l < r)
        {
            int temp = arr[r] ; 
            arr[r] = arr[l] ; 
            arr[l] = temp ; 
            l++ ; 
            r-- ; 
        }
    }
    public static void fun(int[] arr , int n)
    {
        if(arr.length == 2)
            {
                System.out.println(arr[0] + " " + arr[1]) ; 
                 
                return ; 
            }

        boolean ok = true;

        for(int i = 0; i <= n-3; i++) {
            if(arr[i] % arr[i+1] != arr[i+2]) {
            ok = false;
            break;
            }
    }

    if(ok)
        System.out.println(arr[0] + " " + arr[1]);
    else
        System.out.println(-1);


    }
    public static void main(String[] args) {
        int t ; 
        Scanner sc =   new Scanner(System.in) ; 
        t = sc.nextInt() ; 


        while(t > 0)
        {

            int n = sc.nextInt() ; 
            int arr[] = new int[n] ; 
            for(int i=0 ; i<n ; i++)
            {
                int val = sc.nextInt() ; 
                arr[i] = val ; 
            }

            Arrays.sort(arr);
            reverse(arr);
            // Collections.reverse(Arrays.asList(arr));
            // System.out.println("Reversed ");
            // for(int i=0  ;i<n ; i++)
            // {
            //     System.out.print(arr[i] + " ");
            // }


            
            fun(arr,n) ; 


            
            t-- ; 

            
        }
    }
}
