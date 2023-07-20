import java.util.Arrays;

class rotationArr {
    static int[] leftRotation(int[] arr){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }

    static int[] rigthRotation(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int[] arr2= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(leftRotation(arr)));
        System.out.println(Arrays.toString(rigthRotation(arr2)));
    }
}
