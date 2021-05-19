import java.util.Scanner;
public class Menu
{


public String displayMenu() {

    return "***MENU***\n" +
            "1. Enter a new note\n" +
            "2. Retrieve a note\n" +
            "3. Summary of a note\n" +
            "4. Exit";
}

public int getInput()
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a choice: ");
    int choice = input.nextInt();
    return choice;
}
}