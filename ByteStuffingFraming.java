import java.util.Scanner;

public class ByteStuffingFraming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        
        StringBuilder bytestuffed = new StringBuilder();
        bytestuffed.append("F");  // Start Flag
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'F' || ch == 'E') {
                bytestuffed.append("E");  // Escape character
            }
            bytestuffed.append(ch);
        }
        bytestuffed.append("F");  // End Flag
        
        System.out.println("Byte Stuffed Framing: " + bytestuffed);

        sc.close();
    }
}
