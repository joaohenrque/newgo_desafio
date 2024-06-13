public class Main {
    public static void main(String[] args) {

        String password1 = "GeeksForGeeks";

        try {
            System.out.println("Is Password "
                    + password1 + " valid?");
            PasswordValidator.isValid(password1);
            System.out.println("Valid Password");
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

        String password2 = "Geek007@GFG";
        try {
            System.out.println("\nIs Password "
                    + password2 + " valid?");
            PasswordValidator.isValid(password2);
            System.out.println("Valid Password");
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}
