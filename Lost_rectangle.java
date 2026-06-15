    import java.util.Scanner;

    public class Lost_rectangle {
        public static void main(String[] args) {
            long t ; 
            Scanner sc = new Scanner(System.in);

            t = sc.nextLong() ; 
            long mini = Long.MAX_VALUE; 
            for(long i=1 ; i<= Math.sqrt(t) ; i++)
            {
                if(t%i == 0)
                {
                    long j = t / i  ; 

                    mini = Math.min(mini , i + j) ;
                }
            }

            System.out.println(2 * mini);

        }
        
    }
