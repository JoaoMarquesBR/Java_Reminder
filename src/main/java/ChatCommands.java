import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChatCommands {

    Scanner scn = new Scanner(System.in);


    public void showMenu(){
        System.out.println("1 - Add new reminder");
        System.out.println("2 - Check reminder list");
        System.out.println("3 - Delete reminder");
    }

    /**
     *   Gets the data for when the reminder is supposed to be and save It
     */
    public void addReminder(){
        System.out.println("Let's start getting the date desired in the correct format\n");

        System.out.println("Format : YYYY/MM/DD");
        System.out.println("Set a date :");

        String input="2002/03/13";
        checkFormat(input,new ArrayList<>(Arrays.asList(4,7)));

        System.out.println("Date set for "+ "(Date_Change)\n");

        System.out.println("Time Format : HH:MM ");
        System.out.println("Set a time :");
        input="12:30";
        checkFormat(input,new ArrayList<>(Arrays.asList(2)));

    }

    /**
     * Checks if user input  matches corresponding format
     * Function is used for Date and Time formats
     */
    private boolean checkFormat(String input,ArrayList<Integer>indexes){
        for(int i=0;i<input.length();i++){
            if( !Character.isDigit(input.charAt(i)) && !indexes.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
