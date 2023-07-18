package Methods;

import java.util.Scanner;

class findGCD {

    static int findingGCD(int n,int m){
        if(n<=0||m<0){
            return 0;
        }else if(m==0){
            return n;
        }else{
            return findingGCD(m,n%m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findingGCD(n, m));
       sc.close();
    }   
}
