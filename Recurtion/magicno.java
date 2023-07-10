import java.util.Scanner;

class magicno {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int sum = magic(n);
       if(sum==0){
        System.out.println("True");
       }else if(sum==-1){
        System.out.println("False");
       }
       sc.close();

    }

    public static int magic(int n){
        if(n==1){
            return 0;
        }else if(n<=9 && n!=1){
            return -1;
        }else{
            int sum=0;
            while(n>9){
            int temp = n%10;
            sum = sum+temp;
            n=n/10;
            }
            sum=sum+n;
            return magic(sum);
        }
    }
    
}
