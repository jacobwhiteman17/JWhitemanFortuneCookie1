import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class fortuneCookie {
    static String fileName = "src/sayings.txt";//the file of sayings
    static Scanner reader = new Scanner(System.in);
    static Random randGen = new Random();

    //public String theLoop(){

    //}

    public static void main (String[] args)throws IOException{
          System.out.println(Paths.get(fileName));
          String allSayings = Files.readString(Paths.get(fileName));//reading the list
          String[] sayings = allSayings.split("\n");

        System.out.println("How many sayings would you like to read? ");
        var userChoice = reader.nextInt();

        for (int i=userChoice; i>0;i--){
            var randSaying = randGen.nextInt(sayings.length-1);
            System.out.println(sayings[randSaying]);
            System.in.read();


        }

    }
}
