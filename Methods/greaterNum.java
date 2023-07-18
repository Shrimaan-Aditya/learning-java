package Methods;

class greaterNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = checkGreater(a,b);
        System.out.println("Greater Number is "+c);
        
    }

    static int checkGreater(int n, int m){
        return n>m?n:m;
    }
}
