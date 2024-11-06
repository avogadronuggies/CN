import java.util.*;

public class Framing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        
        System.out.println("Menu: \n1. Character Count\n2. Byte Stuffing\n3. Bit Stuffing\n4. Physical Data Violation\n5. Exit");
        
        while (x) {
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();
            
            switch (option) {
                case 1:
                    // Character Count Framing
                    System.out.println("Character Count Framing: " + input.length() + input);
                    break;
                
                case 2:
                    // Byte Stuffing
                    StringBuilder bytestuffed = new StringBuilder();
                    bytestuffed.append("F"); // Start flag
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == 'F' || input.charAt(i) == 'E') {
                            bytestuffed.append("E"); // Escape character before F or E
                        }
                        bytestuffed.append(input.charAt(i));
                    }
                    bytestuffed.append("F"); // End flag
                    System.out.println("Byte Stuffing: " + bytestuffed);
                    break;
                
                case 3:
                    // Bit Stuffing
                    StringBuilder bitstuffed = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < input.length(); i++) {
                        char bit = input.charAt(i);
                        bitstuffed.append(bit);

                        if (bit == '1') {
                            count++;
                        } else {
                            count = 0;
                        }

                        // After 5 consecutive '1's, append a '0' for bit stuffing
                        if (count == 5) {
                            bitstuffed.append("0");
                            count = 0; // reset count after stuffing
                        }
                    }
                    System.out.println("Bit Stuffing: " + bitstuffed);
                    break;
                
                case 4:
                    // Physical Layer Coding Violation (example with appending "01" for coding)
                    System.out.println("Physical Layer Coding Violation: " + input + "01");
                    break;
                
                case 5:
                    x = false; // Exit the program
                    System.out.println("Exiting program...");
                    break;
                
                default:
                    System.out.println("Please enter a valid option!");
                    break;
            }
        }
        
        sc.close();
    }
}
