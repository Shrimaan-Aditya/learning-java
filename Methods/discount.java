package Methods;

class discount {
    static void disc(double ...pri){
        double total = 0;
        double discountValue = 0;

        for(double x : pri){
            total+=x;
        }
        System.out.print("Total Price = "+total);
        System.out.println("");
        
        if(total>=500&&total<1000){
            discountValue=total*0.1;
            System.out.print("10% Discount Amount = "+discountValue);
            System.out.println("");
            total-=discountValue;
        }

        if(total>=1000&&total<1500){
            discountValue=total*0.2;
            System.out.print("20% Discount Amount = "+discountValue);
            System.out.println("");
            total-=discountValue;
        }

        if(total>=1500&&total<2000){
            discountValue=total*0.3;
            System.out.print("30% Discount Amount = "+discountValue);
            System.out.println("");
            total-=discountValue;
        }

        if(total>=2000){
            discountValue=total*0.4;
            System.out.print("40% Discount Amount = "+discountValue);
            System.out.println("");
            total-=discountValue;
        }

        System.out.print("Discounted Price = "+total);
    }

    public static void main(String[] args) {
        disc(2.3,45.34,43,453.45,32.34533,459.33,530,54643.84);
    }
}
