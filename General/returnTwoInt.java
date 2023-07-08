package General;

class returnTwoInt {
   
    public static String prod(int[] a) {
    int max1=0;
    int max2=0;
    String pair="";
    for (int i = 0; i < a.length; i++) {
            if (a[i]>max1) {
                max1=a[i];
            }
              
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]<max1&&a[i]>max2) {
                max2=a[i];
            }
              
        }
            System.out.println(max1);
            System.out.println(max2);
            pair = Integer.toString(max1)+" , "+Integer.toString(max2);
            return pair;        
}

public static void main(String[] args) {
    int[] array = {15, 8, 4, 13, 5, 11, 7, 20, 3, 66};
    System.out.println(prod(array));
}
    
}
