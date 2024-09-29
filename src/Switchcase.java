//import java.util.scanner;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {

        System.out.println("Please input the month");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i){
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 7:
                System.out.println("秋季");
                break;
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("Error");


        }
    }
}
