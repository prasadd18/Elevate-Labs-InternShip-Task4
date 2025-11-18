import java.util.*;
import java.io.*;

class NotesApp {
    static Scanner sc = new Scanner(System.in);
    private static final String FILE_NAME = "Notes.txt";

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Notes Manager =====");
            System.out.println("1. Add Notes");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (n) {
                case 1:
                    addNotes();
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Choose Valid Option");
            }
        }
    }

    private static void addNotes() {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            System.out.print("Enter Your Note: ");
            String notes = sc.nextLine();
            fw.write(notes + System.lineSeparator());
            System.out.println("Your Note Saved Successfully!");
        } catch (IOException e) {
            System.out.println("Error Occurred While Writing Note: " + e.getMessage());
        }
    }

    private static void viewNotes() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Your Notes ---");
            while ((line = br.readLine()) != null) {
                System.out.println("-> " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Was Not Found. Add some notes first!");
        } catch (IOException e) {
            System.out.println("Error Occurred While Reading Notes: " + e.getMessage());
        }
    }
}
