class secLargestNum {
    static int secondLargestNum(int[] arr){
        int highest = Integer.MIN_VALUE;
        int secHighest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>highest) {
                secHighest=highest;
                highest=i;
            }
        }
        return secHighest;
    }

    public static void main(String[] args) {
        int[] arr = {2,34,46,32,264,543};
        System.out.println("Second Highest Number = "+secondLargestNum(arr));
    }
}
