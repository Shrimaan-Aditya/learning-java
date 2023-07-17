package Methods;

class firstMethodWithoutStatic {
    public static void main(String[] args) {
        //2nd Way to call method by creating object
        firstMethodWithoutStatic fm = new firstMethodWithoutStatic();
        fm.meth();
    }

    void meth(){ // Using without Static keyword 
        System.out.println("First Method Called");
    }
}
