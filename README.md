# IS-147-Mini Project
This is my repository for my Mini Project for IS 147 class taken Fall 2021 at UMBC

This project was designed to be a simple note taking app. With restrictions that there would be a maximum of three notes allowed for user input. There are four functions to this program. First is to be able to enter in a note, second is to able to retrieve any note that the user has entered, third is to give a short summary of each note that the user has created and finally, to exit the application.

Classes used for this project:
-Main.java
-Controller.java
-Note.java
-Menu.java


Overview of each class:
-Main.java
  This class was meant to create a connection to the Controller class. It has one function, the main function and creates a Controller object. That is it's sole purpose.
  
-Controller.java
    As described by my professor who assigned this project, this class is like "the traffic cop". It's main intent is to ensure that when the menu is running, that each input that the user enters is able execute its respective function properly. This program has a constructor in which its intent is to make an object that is connected to the Menu class, this allows the user to be able to call the Menu class to display the menu throughout the program. The second line in the constructor is to create an array with a fixed size of 3. This ensures that the user can not input more than 3 notes. Finally the constructor has a third line that calls the method mainLoop(). This actually is the skeleton of the program.
  
  As stated before, the skeleton of the program is the mainLoop() function. This is a void function, so there is no return statement. The main structure of this a giant while loop that will continue to run until the user decides to exit the loop. There is a switch statement to execute each block of code that the user wants. There are four cases, for this switch statement. This switch statement is decided upon the user input after the menu is displayed. For case 1: Entering a new note, the user is allowed to enter up to 3 notes. Each note has its unique label and note content. For this I used an if-else statement as a double check to ensure that the user can not enter more than 3 note, else there is a print statement that tells them to choose another choice and it displays the menu again. The second case is to retrieve note, this case doesn't need to ensure that the user has already entered three notes, rather it will simply display whichever note that the user wants that already exists. It displays both the label and the note content itself. The third case is used to display a quick summary of the note, I used a for loop to ensure that it would only print out whatever was already creatd considering how many notes the user had already made. This case displays the date that the note was created as well as the label of the note. The fourth case exits the whole program as a whole.
  
-Menu.java
  This class has two methods. A public string method called displayMenu() and a public int method called getInput(). The displayMenu() method only displays the menu each time it is called in the controller class. It keeps being called until the user exits the program. The getInput() class returns the user choice each time they go through the switch statement in the controller class.
  
-Note.java
  There are two constructors for this program. The first constructor calls for the import of java.util.Date, this is used for case 3 of the controller class. This allows for the user to see what time they "created" each note. The second constructor has two arguments, the label of the note, and the note content itself. When the user wants to create a note in the controller class, they call the setNote() method in order to create the note. In this method, it allows for the user to input what label and content they want for each note. It also creates a dateCreated variable that will record what time they created the note. The next method is a getter method, called getNote(). This method is used for case 2. It returns the actual note content back to the user. The next method is getLabel(), this method returns the label that the user created for it's respective note. This method is called in case 2 of the switch statement. Finally, there is a method called getSummary() which is what teh user calls for case 3, when they want the summary.
  
