package TranslateMorse;


import java.util.Scanner;

public class Morsecode {

    static MorsecodeLogic mL = new MorsecodeLogic();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***Welcome to the awesome morse translator!***");

        while (true) {
            System.out.println("Type 1 for english text to morse");
            System.out.println("Type 2 for morse to english");
            System.out.println("Type 3 to stop the program");
            try {
                int number = Integer.parseInt(scan.nextLine());

                switch (number) {
                    case 1:
                        System.out.println("Write your text in english");
                        String input = scan.nextLine();
                        mL.getMorse(input);
                        System.out.println(mL.getMorse(input));
                        break;
                    case 2:
                        System.out.println("Write your text in morse");
                        String inputM = scan.nextLine();
                        mL.getText(inputM);
                        System.out.println(mL.getText(inputM));
                        break;
                    case 3:
                        System.out.println("***You have stopped the program***");
                        System.exit(0);
                    default:
                        System.out.println("***Please choose 1, 2 or 3***"); //Felhantering av val
                }
            } catch (NumberFormatException e) { //Felhantering om man skriver annat än nummer i första valet
                System.out.println("***You did not type a number!***");
            }
        }

    }
}
