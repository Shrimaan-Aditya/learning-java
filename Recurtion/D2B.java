import java.util.Scanner;

public class D2B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(dec2bi(n));
       sc.close();

    }

    static int dec2bi(int n){
        
        if(n<0){
            return -1;
        }
        if(n==0){
            return n;
        }else{
            return n%2+10*dec2bi(n/2);
        }
    }
}
