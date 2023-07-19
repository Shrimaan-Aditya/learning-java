/*
 * 
 * An Array without Declearing
 * 
 */
class anonymousArray{
    static void printArr(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        
        printArr(new int[]{1,2,3,4,5});
        System.out.println("");
        printArr(new int[]{5,33,34, 56, 55, 76});
    }
}