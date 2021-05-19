import java.util.Scanner;
import java.util.Date;
public class Note
{
    private java.util.Date dateCreated;
    private String label;
    private String noteStr;
    private int noteNum;
    private String theNotes;

    public Note()
    {
        dateCreated = new java.util.Date();
    }

    public Note(String label, String noteStr)
    {
        this();
        this.label = label;
        this.noteStr = noteStr;
    }

    public void setNote() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the label for your note at the prompt");
        System.out.print("Enter Label>");
        this.label = in.nextLine();
        System.out.println("Enter your note at the prompt");
        System.out.print("Enter Note>");
        theNotes = in.nextLine();
        dateCreated = new Date();
    }

    public String getTheNote()
    {
        return this.theNotes;
    }

    public String getLabel()
    {
        return this.label;
    }

    public void setName(String label)
    {
        this.label = label;
    }

    public String getSummary()
    {
        return dateCreated + " Label: " + this.label;
    }

}