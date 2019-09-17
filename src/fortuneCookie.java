import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class fortuneCookie {
    public static void main (String[] args)throws IOException{
          var fileName = "src/sayings.txt";//the file of sayings
          var reader = new Scanner(System.in);
          var randGen = new Random();
          System.out.println(Paths.get(fileName));
          String allSayings = Files.readString(Paths.get(fileName));//reading the list
          String[] sayings = allSayings.split("\n");

        System.out.println("How many sayings would you like to read? ");

        var userChoice = reader.nextInt();
        for (int i=userChoice; i>0;i--){
            var randSaying = randGen.nextInt(20);
            System.out.println(sayings[randSaying]);
            var keepGoing = reader.next();


        }




    }
}
