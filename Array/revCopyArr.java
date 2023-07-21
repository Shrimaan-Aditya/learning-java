import java.util.Arrays;

class revCopyArr {
    static int[] copy(int[] arr){
        int[] copyArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copyArr[i]=arr[arr.length-i-1];
        }
        // copyArr[arr.length/2]=2;
        return copyArr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(copy(arr)));
    }
}
