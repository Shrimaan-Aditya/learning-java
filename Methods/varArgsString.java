package Methods;

class varArgsString {
    static void printArr(int a, String ...arr){
        for(String x : arr){
            System.out.println(a+" "+x);
        }
    }

    public static void main(String[] args) {
        // printArr("Ram","Shyam","sita","Radha");
        // System.out.println(" ");
        printArr(5, "Sita Ram","Radhe Krishna");
        // System.out.println(" ");
        // printArr(new String[]{"Sita","Ram","Radhe","Shyam"});
        // System.out.println(" ");

    }
    
}
