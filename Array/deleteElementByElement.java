import java.util.Arrays;

/*
 * This well take O(n*n) Time Complexcity
 */

class deleteElementByElement {
    static int[] delete(int[] arr, int arrEle){
        int arrSize = arr.length;//6
        for(int i=0;i<arrSize-1;i++){//
            if(arr[i]==arrEle){//i=2
                for(int j=i;j<arrSize-1;j++){//j=2 , 2<5 , 3
                    arr[j]=arr[j+1];//arr[2]=arr[3];
                }
            }
        }
        arr[arr.length-1]=0;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(delete(arr,6)));
    }
}
