
class findingnum {
     public static void numCheck(int[] a, int target) {
        
        for (int i = 0; i < a.length; i++) {
                if (a[i]==target) {
                  System.out.println("Found at index: "+i); 
                  return;
                }        
            }  
             System.out.println(target+" Not Found");        
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8};
        numCheck(array, 11);  // Print the result using Arrays.toString()
    }
}
