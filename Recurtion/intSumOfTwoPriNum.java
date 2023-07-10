import java.lang.Math;
import java.util.Scanner;

// If a number is prime, we subtract it from the given number and check if the difference is also a prime number.
// If both the current number and the difference are prime, we return true, indicating that the given number can be expressed as the sum of two primes.

class intSumOfTwoPriNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int sum = check(n);
       if(sum==0){
        System.out.println("True");
       }else if(sum==-1){
        System.out.println("False");
       }
       sc.close();

    }

    public static int checkPri(int n){
        if(n<=1){
            return -1;
        }
        else
        {
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if(n%i==0){
                    return -1;
                }
            }
        }
        return 0;
    }

    public static int check(int n){
        for(int i=2;i<=n/2;i++){
        if(checkPri(i)==0 && checkPri(n-i)==0){
            return 0;
        }
    }
        return -1;
    }
}
