package Methods;

class validateNameAge {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age){
        return age>3&&age<15;
    }

    public static void main(String[] args) {
        String name = "Aditya";
        String name1 = "Singh";
        String name2 = "Si ngh";
        String name3 = "Singh1";

        int age = 12;
        int age1 = 10;
        int age2 = 4;
        int age3 = 18;

        System.out.println("Validation Return : "+validate(name));
        System.out.println("Validation Return : "+validate(name1));
        System.out.println("Validation Return : "+validate(name2));
        System.out.println("Validation Return : "+validate(name3));

        System.out.println("Validation Return : "+validate(age));
        System.out.println("Validation Return : "+validate(age1));
        System.out.println("Validation Return : "+validate(age2));
        System.out.println("Validation Return : "+validate(age3));

    }
}
