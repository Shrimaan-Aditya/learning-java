package Methods;
/*
 * Maximun of Number Using varArgs
 */

class maxNum {
    static void max(int ...num){
        int temp = Integer.MIN_VALUE;
        for(int x:num){
            if(x>temp){
                temp = x;
            }
        }
        System.out.println("Maximum Number is "+temp);
    }

    public static void main(String[] args) {
        max(1,3,45,67,98,688,754);
    }
}
