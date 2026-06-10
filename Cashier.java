import java.util.Scanner;
class Pair{
    int first ; 
    int second ; 
    Pair(int f,int s)
    {
        this.first = f ; 
        this.second =s ; 
    }
}
public class Cashier {
    public static void main(String[] args) {
        int n,l,a ; 
        int cnt = 0 ;
        Scanner sc = new Scanner(System.in) ;

        n=sc.nextInt();
        l=sc.nextInt();
        a=sc.nextInt();
        int f = n ; 

        if(n == 0)
        {
            int c = l/a ; 

            cnt += c ;

            System.out.println(cnt);
            return ; 
        }

        if(n == 1)
        {
            int x = sc.nextInt() ; 
            int y = sc.nextInt() ; 

            int c = y - l ; 
            cnt += c/a ; 

            System.out.println(cnt); 
            return ; 
        }



        Pair arr[] = new Pair[n] ; 
        int ind = 0 ; 

        while(n > 0)
        {
            int t = sc.nextInt() ; 
            int tl = sc.nextInt() ; 

            Pair p = new Pair(t, tl) ; 
            arr[ind] = p ; 
            ind++ ; 
            n-- ; 
        }


        int curr = 0   ; 

        for(int i=1 ; i<arr.length ; i++)
        {  
            int f_val = arr[i-1].first ; 
            int s_val = arr[i-1].second ;
            
            int ff_val = arr[i].first ; 
            int ss_val = arr[i].second ; 

            int diff = ff_val - s_val ; 

            if(diff  > a)
            {
                int c = diff/a ; 

                cnt += c ; 

            }


            // lost la erukura value  

            int last_val = l-arr[f-1].second ; 

            if(last_val > a)
            {
                 int c = last_val/a ; 

                cnt += c ; 
            }


            System.out.println(cnt);



        }


    }
}
