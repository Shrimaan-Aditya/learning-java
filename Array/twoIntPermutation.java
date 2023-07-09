//Are Permutaion of two int arrays each other
class twoIntPermutation {
    public static boolean checkPermu(int[] a1, int[] a2){
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for(int i=0; i < a1.length; i++){
            sum1+=i;
            mul1*=i;
        }
        for(int j=0; j < a1.length; j++){
            sum2+=j;
            mul2*=j;
        }

        if(sum1==sum2 && mul1==mul2){
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,5,3,4};
        System.out.print(checkPermu(arr1,arr2));
    }
}
