package Methods;

import java.util.Arrays;
import java.util.Scanner;

class revIntArr {

    static int[] rev(int[] arr){
        int sizeArr = arr.length;
        for(int i=0;i<sizeArr/2;i++){
            int temp=arr[i];
            arr[i]=arr[sizeArr-i-1];
            arr[sizeArr-i-1]=temp;
        }
        return arr;
    }

    static int rev(int num){
        int a = 0;
        int temp=0;
        while(num>10){
        a = num%10;
        num=num/10;
        a=a+temp;
        temp=a*10;
        }
        return temp+num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 for Reversing the Integer");
        System.out.println("Select 2 for Reversing the Array");
        System.out.print("Enter the Option : ");
        int opt = sc.nextInt();
        if(opt==1){
        System.out.print("Enter the number : ");        
        int num = sc.nextInt();
        System.out.println(rev(num));
        }
        else{
            System.out.print("Enter the Size of Array : ");        
            int arrsize = sc.nextInt();
            int[] arr = new int[arrsize];
            System.out.print("Enter the Elements of Array : "); 
            for(int i=0;i<arrsize;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(rev(arr)));
        }
        sc.close();
    }
    
}
