package part4.c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guestlist {
    private static final String GUEST_LIST_FILE = "laudalassan.txt";  // Adjust the file name as needed

    public static void main(String[] args) {
        List<String> guestList = readGuestList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guest List Application!");

        while (true) {
            System.out.print("Enter a name (or 'exit' to end): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (isOnGuestList(name, guestList)) {
                System.out.println(name + " is on the guest list!");
            } else {
                System.out.println(name + " is not on the guest list.");
            }
        }

        scanner.close();
    }

    private static List<String> readGuestList() {
        List<String> guestList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(GUEST_LIST_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                guestList.add(line.trim());
            }

            System.out.println(guestList);
        } catch (IOException e) {
            System.err.println("Error reading guest list file: " + e.getMessage());
        }

        return guestList;
    }

    private static boolean isOnGuestList(String name, List<String> guestList) {
        return guestList.contains(name);
    }
}