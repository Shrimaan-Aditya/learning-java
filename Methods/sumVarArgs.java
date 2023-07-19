package Methods;
/*
 * Using Variable arguments Sum the numbers
 */

public class sumVarArgs {
    static void sum(int ...num){
        int total = 0;
        for(int x:num){
            total+=x;
        }
        System.out.println("Sum of number is "+total);
    }

    public static void main(String[] args) {
        sum(1,2,3,4,5,7,8,6,9,10);
    }
}
