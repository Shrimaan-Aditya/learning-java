package Methods;

import java.util.Scanner;

class findPrimeNum {

    static int isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = isPrime(num);
        if(n==0){
            System.out.println(num+" is Not a Prime Number");
        }else{
            System.out.println(num+" is a Prime Number");
        }
        sc.close();
    }
}
