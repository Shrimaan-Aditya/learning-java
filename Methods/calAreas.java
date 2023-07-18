package Methods;

class calAreas {

    static int area(int l, int b){
        return l*b;
    }

    static int area(int l){
        return l*l;
    }

    static float area(float l, float b){
        return (l*b)/2;
    }

    static double area(double r){
        return Math.PI*r*r;
    }

    static double area(double r1, double r2){
        return (Math.PI*r1*r2)/2;
    }

      
    public static void main(String[] args) {
        int l=10;
        int b=20;
        System.out.println("Area of Rectangle : "+area(l,b));
        System.out.println("Area of Square : "+area(l));
        System.out.println("Area of Rhombus : "+area(l,b));
        float n= 23.56f;
        float m=22.34f;
        System.out.println("Area of Triangle : "+area(n,m));
        double d = 34.34;
        System.out.println("Area of Circle : "+area(d));
        double r1 = 23.342;
        double r2 = 34.334;
        System.out.println("Area of Ellipse : "+area(r1,r2));
    }
}
