package Methods;

class extractingUserName {
    public static void main(String[] args) {
        String email = "aditya@gmail.com";
        String userName = userNameFind(email);
        System.out.println(userName);
    }
    
    static String userNameFind(String email){
        int a = email.indexOf('@');
        String userName = email.substring(0, a);
        return userName;
    }

}
