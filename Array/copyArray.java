import java.util.Arrays;

class copyArray {
    public static String length;

    static int[] copy(int[] arr){
        int[] copyArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copyArr[i]=arr[i];
        }
        copyArr[arr.length/2]=2;
        return copyArr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(copy(arr)));
    }
}
