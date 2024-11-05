import java.util.Scanner;

public class BitStuffingFraming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary string: ");
        String input = sc.nextLine();
        
        StringBuilder bitstuffed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            bitstuffed.append(ch);

            if (ch == '1') {
                count++;
            } else {
                count = 0;
            }

            if (count == 5) {
                bitstuffed.append('0');  // Insert '0' after five consecutive '1's
                count = 0;
            }
        }
        
        System.out.println("Bit Stuffed Framing: " + bitstuffed);

        sc.close();
    }
}
