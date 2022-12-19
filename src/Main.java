import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double exchange = 0;
        double result = 0;
        int flag = 0;

        System.out.println("Input bgLv: ");
        double bgLv = Double.parseDouble(scan.nextLine());

        while (flag != -1) {
            System.out.println("Menu");
            System.out.println("1. Euro\n2. Dollar\n3. Pound");

            System.out.println("Choose option: ");
            //String currency = scan.nextLine();
            flag = Integer.parseInt(scan.nextLine());

            switch (flag) {
                case 1:
                    exchange = 0.51;
                    break;

                case 2:
                    exchange = 0.49;
                    break;

                case 3:
                    exchange = 0.46;
                    break;

                default:
                    System.out.println("Unknown currency!");

            }
            result = bgLv * exchange;
            System.out.printf("Final currency: %.2f%n", result);
        }


    }
}