package Methods;

class diffBWActualAndFormalPara {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Passing the value of a and b");
        System.out.println("A value is equal to "+a); //if value of a =10 Means a Method is not afected by any other methods
        System.out.println("B value is equal to "+b);
        System.out.println(" ");

        int c = addition(a,b);//Actual Parameter

        System.out.println("After Passing the value of a and b");
        System.out.println("A value is equal to "+a); //if still value of a is same as the time of assigned, Means a Method can not affected by any other methods when we are passing the value
        System.out.println("B value is equal to "+b);
        System.out.println("Method should be return 32 after incremented by a++ and b++ : "+c);
    }
    static int addition(int a, int b){//Formal Parameter
        a++;
        b++;
        return a+b;
    }
}
