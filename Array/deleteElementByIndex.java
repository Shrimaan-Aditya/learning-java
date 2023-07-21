import java.util.Arrays;

class deleteElement {
    static int[] delete(int[] arr, int arrIndex){
        
        for(int i=arrIndex;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(delete(arr,6)));
    }
}
