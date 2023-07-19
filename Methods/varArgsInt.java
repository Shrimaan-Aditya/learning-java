/*
 * Variable Arguments(int ...a) or (String ...n)
 */

package Methods;

class varArgsInt {
    static void printArr(int ...arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        printArr(11,22,33,44,55);
        System.out.println("");
        printArr(1,2,3,4,5);
        System.out.println("");
        printArr(new int[]{5,33,34, 56, 55, 76});
    } 
}
