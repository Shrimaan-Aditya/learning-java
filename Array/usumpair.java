import java.util.Arrays;

class usumpair {
    public static int[] sumCheck(int[] a, int target) {
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {  // Changed the loop variable initialization
                if ((a[i] + a[j]) == target) {
                   return new int[] {a[i],a[j]}; 
                }
            }
        }
        
        throw new IllegalArgumentException("No Solution Found");
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sumCheck(array, 10)));  // Print the result using Arrays.toString()
    }
}
