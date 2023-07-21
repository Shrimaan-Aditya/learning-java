import java.util.Arrays;

class increseSizeCopyArr {
    static int[] copy(int[] arr, int size){
        int[] copyArr = new int[size];
        for(int i=0;i<arr.length;i++){
            copyArr[i]=arr[i];
        }
        System.out.println("After Size of  Array "+copyArr.length);
        return copyArr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println("Before Size of Array "+arr.length);        
        System.out.println(Arrays.toString(copy(arr,10)));
        
    }
}
