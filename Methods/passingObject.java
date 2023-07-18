package Methods;

import java.util.Arrays;

class passingObject {

    static int[] update(int[] a, int index, int value){
        a[index]=value;
        return a;
    }

    static int change(int b){
        int r = b+10;
        return r;
    }
    public static void main(String[] args) {
        System.out.println("Passing Object as Parameter");
        System.out.println("");
        int a[] = {2,3,4,5,6};
        int[] s=update(a,2,20);
        System.out.println("The updated Index value "+a[2]);
        System.out.println("Array at Main Method"+Arrays.toString(a));
        System.out.println("Array Returned"+Arrays.toString(s));

        System.out.println("");
        System.out.println("But When we passing Value as Parameter");
        System.out.println("");
        int x =10;
        System.out.println("Initialized x Value at main Method "+x);
        int c = change(x);
        System.out.println("x value after method called at main method "+x);
        System.out.println("Returned Value from change "+c);
    }
}
