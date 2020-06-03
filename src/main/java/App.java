import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        boolean optionsLoopThrough = true;

        System.out.println("------------- CAESAR CIPHER -------------\n" + "Welcome to Caesar's Cipher App. Here you can encrypt & decrypt any sentence of choice.\n");
        while(optionsLoopThrough){
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Choose an option to proceed:\n" + "1: Encrypt text\n" + "2: Decrypt text\n" + "3: Exit App");
            int optionSelected = myInput.nextInt();
            myInput.nextLine(); // To be consumed by nextInt;

            if(optionSelected == 1){
                //Encrypt
                System.out.println("Enter text you want to encrypt:");
                String userInput = myInput.nextLine();
                System.out.println("Which direction do you want to encrypt your information? Right or Left");
                String userDirection = "";

                boolean validDirection = true;
                while(validDirection){
                    userDirection = myInput.nextLine();
                    if(!userDirection.equalsIgnoreCase("right") && !userDirection.equalsIgnoreCase("left")){
                        System.out.println("Please select a direction by typing left or right");
                    }
                    else {
                        validDirection = false;
                    }
                }

                System.out.println("How many characters do you want to shift your information to the "+userDirection);
                int userShift = myInput.nextInt();
                Cipher cipher = new Cipher(userInput);
                System.out.println("Your Input: "+userInput);
                System.out.println("Encrypted Input: "+cipher.encryptText(userDirection, userShift));
            }
            else if(optionSelected == 2){
                //Decrypt
                System.out.println("Enter text you want to decrypt:");
                String userInput = myInput.nextLine();
                System.out.println("In which direction do you want to decrypt your information? Right or Left");
                String userDirection = "";

                boolean validDirection = true;
                while(validDirection){
                    userDirection = myInput.nextLine();
                    if(!userDirection.equalsIgnoreCase("right") && !userDirection.equalsIgnoreCase("left")){
                        System.out.println("Please select a direction by typing left or right");
                    }
                    else {
                        validDirection = false;
                    }
                }

                System.out.println("How many characters do you want to shift your cypher to the "+userDirection);
                int userShift = myInput.nextInt();
                Cipher cipher = new Cipher(userInput);
                System.out.println("Your Input: "+userInput);
                System.out.println("Decrypted Input: "+cipher.decryptText(userDirection, userShift));

            }
            else if(optionSelected == 3){
                optionsLoopThrough = false;
            }
            else {
                System.out.println("Your input is not recognized. Please select an option!");
            }
        }
        myInput.close();
    }
}
