import java.util.Scanner;
// your imports here such as ....
// etc

public class Controller {

    // the controller class has a Menu object as a member
    private Menu menu;

    // 3 Notes are requried for the project
    private final int SIZE = 3;
    // index for notes - count for number of notes
    private int index = 0;

    // an array of Notes - this asssumes you have created a Note class
    private Note[] theNotes;

    // provide a constructor for the Controller class -
    // the constructor will create the objects that are needed
    // and start the main loop
    public Controller() {
        this.menu = new Menu();
        this.theNotes = new Note[SIZE];
        this.mainLoop();
    }

    private void mainLoop() {
        boolean exit = false;
        int choice= 0;
        int retrieveNumber = 0;

        Scanner scan = new Scanner(System.in);
        // the main loop
        while (!exit) {
            System.out.println(menu.displayMenu());
            choice = menu.getInput();

            //process user choice
            switch (choice) {
                case 1:
                    // new note
                    if(index != 3) {
                        System.out.println("***Entering a new note**");
                        Note note = new Note();
                        note.setNote();
                        theNotes[index++] = note;
                    }
                    else
                    {
                        System.out.println("You have exceeded the max amount of notes. Please choose another option.");
                    }
                    break;
                case 2:
                    // retrieve a note
                    System.out.println("There are currently " + index + " note(s)");
                    System.out.println("Enter which note you want to retrieve: ");
                    int noteNum = scan.nextInt();
                    System.out.println("Note " + noteNum + ": ");
                    noteNum -= 1;
                    theNotes[noteNum].getTheNote();
                    //display the retrieved note
                    System.out.println("Label: "+theNotes[noteNum].getLabel());
                    System.out.println("Note: "+theNotes[noteNum].getTheNote());
                    break;
                case 3:
                    // get summary all notes
                    System.out.println("There are currently " + index + " note(s)");
                    for (int i = 0; i < index; i++)
                    {
                        System.out.println(theNotes[i].getSummary());
                    }
                    break;
                case 4:
                    System.out.println("***Exiting***");
                    exit = true;
                    break;
                default: System.out.println("Incorrect Choice");
                    break;
            } //switch
        } //while

        //EXIT
        System.out.println("User has chosen to end the application.");
    } //mainLoop

} //ControllerTemplate
