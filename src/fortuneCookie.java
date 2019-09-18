import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class fortuneCookie {
    static String fileName = "src/sayings.txt";//the file of sayings
    static Scanner reader = new Scanner(System.in);//scanner
    static Random randGen = new Random();//random
    static String[] sayings = new String[0];//creates my empty array

    public static String getSaying(){
        String newSaying= "";//empty saying we can plug stuff into

        int randNum = randGen.nextInt(sayings.length);//take a random number from array
        newSaying = sayings[randNum];//updates newSaying to take one of the items in the list into the " "
        return newSaying;//returns the new saying
    }

    public static void main (String[] args)throws IOException{
        String allSayings = Files.readString(Paths.get(fileName));//reading the text file
        sayings = allSayings.split("\n");//updates array to split between enter keys

        System.out.println("How many sayings would you like to read? ");//simple
        var userChoice = reader.nextInt();//user input

        for (int i=userChoice; i>0;i--){//for the userChoice, when its greater than 0, subtract
            System.out.println(getSaying());//print our getSaying function
            System.in.read();//allows user to hit enter to continue. Had an issue with the nextLine() so I eventually found this


        }

    }
}
