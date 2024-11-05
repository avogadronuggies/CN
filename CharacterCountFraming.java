import java.util.Scanner;

public class CharacterCountFraming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        
        System.out.println("Character Count Framing: " + input.length() + input);

        sc.close();
    }
}
