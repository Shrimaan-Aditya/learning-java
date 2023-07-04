import java.util.Scanner;

public class gdc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and its power");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gdc(n, m));
       sc.close();
}

    static int gdc(int n, int m){
        if(n<=0||m<0){
            return 0;
        }else if(m==0){
            return n;
        }else{
            return gdc(m,n%m);
        }
    }
}