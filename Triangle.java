public class Triangle {
    public static void main(String[] args) {
        int rows = 6;  // Number of rows in the triangle

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Create the row string
            String row = " ".repeat(rows - i - 1) + "T".repeat(2 * i + 1);
            
            // Print the row
            System.out.println(row);
        }
    }
}
