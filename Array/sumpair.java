import java.util.Arrays;

class sumpair {
    public static int[] sumCheck(int[] a, int target) {
        int[] dummy = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {  // Changed the loop variable initialization
                int sum = a[i] + a[j];  // Calculate the sum of array elements, not loop indices
                if (sum == target) {
                    dummy[0] = a[i];
                    dummy[1] = a[j];
                    return dummy;
                }
            }
        }
        throw new IllegalArgumentException("No Soultion Found");       
        
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sumCheck(array, 11)));  // Print the result using Arrays.toString()
    }
}
