package Methods;

class maxInArray {

    static int maxNum(int[] arr){
        int n = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,93,4,5,66,7,8,9,0};
        System.out.println(maxNum(arr));
    }
}
