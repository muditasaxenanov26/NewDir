/**
 * Created by Msaxena on 06-05-2019.
 */
public class PrimeNumber {
    static void PrimeNumbers(int n)
    {
        int flag=1,sqrt;
        for(int i=2;i<=n;i++)
        {
            sqrt=(int)Math.sqrt(i);
            for (int j=i-1;j>1;j--)
            {
                if(j!=1) {
                    if (i % j == 0) {
                        flag = 0;
                       // System.out.println(i + " is divided by " + j);
                    }
                }
            }
            if(flag==1)
            {
                System.out.println(i);

            }
            flag=1;
        }
    }
    public static void main(String args[]) {
        int n=29;
        PrimeNumbers(n);
    }
}

