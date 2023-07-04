//import java.util.Scanner;
class revArr{
public static void main(String[] args){
    /*     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(dec2bi(n));
       sc.close();*/

       int[] arr= {1,2,3,4,5};
       //System.out.println(arrRev(arr));
       arrRev(arr);

    }

    static void arrRev(int[] n){
        int[] arr1={};
        for(int i=n.length-1;i>=0;i--){
            for(int j=0;j<n.length;j++){
                arr1[j]=n[i];
        }
    }
    //return arr1;
    for(int k=0;k<n.length;k++){
    System.out.println(arr1[k]);
    }
}
}       