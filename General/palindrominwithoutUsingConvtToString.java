package General;

import java.util.ArrayList;
import java.util.Scanner;

class palindrominwithoutUsingConvtToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palid(n));
        sc.close();
    }

    static boolean palid(int n){
        if(n < 0 || (n % 10 == 0 && n != 0)){
            return false;
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(n > 0){
            int temp = n % 10;
            arrList.add(temp);
            n /= 10;
        }
        
        int size = arrList.size();
        for(int i = 0; i < size / 2; i++){
            if(arrList.get(i) != arrList.get(size - i - 1)){
                return false;
            }
        }
        
        return true;
    }
}
