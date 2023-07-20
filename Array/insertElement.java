import java.util.Arrays;

class insertElement {
    static int[] insert(int[] arr,int value,int arrIndex){
        
        for(int i=arr.length-2;i>=arrIndex;i--){
            arr[i+1]=arr[i];
        }
        arr[arrIndex]=value;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(insert(arr,12,3)));
    }
}
