import java.util.Scanner;

public class PowerRec {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and its power");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(power(n, m));
       sc.close();

    }

    static int power(int n,int m){
        if(n<=0||m<0){
            return 0;
        }else if(m==0){
            return 1;
        }else{
            return power(n,m-1)*n;
        }
    }
}
