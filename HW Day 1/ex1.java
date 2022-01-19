public class ex1 {
    public static void main(String args[]) {
        int k = 4; // Initial number of *
        for (int i = 1; i <= 5; i++) { // Iterate each row
            for (int j = 0; j < k; j++) { // For to print the * k is the number of * to be printed
                System.out.print("*");
            }
            for (int a = 0; a < i; a++) { // printing the letters dependig on the row
                if (i % 2 == 0)
                    System.out.print("E"); // If the number is even print E
                else
                    System.out.print("O"); // If the number is odd print O
            }
            k--; // Reduce the number of * to be printed
            System.out.println();
        }
    }
}