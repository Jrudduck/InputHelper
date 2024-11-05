import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c = InputHelper.getRangedDouble(scan, "Enter a number between 5 and 10.", 10, 5);
        System.out.println("Your number is " + c);
    }
}
