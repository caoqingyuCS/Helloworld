import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        //Please do not copy
        //Be yourself
        // Input variables
        String name;
        String age;
        String place;

        Scanner scnr = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        //Get a name
        name = scnr.next();
        System.out.print("It's nice to meet you, " + name +". How old are you? ");
        //Get an age
        age = scnr.next();
        System.out.print("I see that you are still quite young at only " + age + ".\n");
        System.out.print("Where do you live? ");
        //Get a place
        place = scnr.next();
        System.out.print("Wow! I've always wanted to go to " + place + ". Thanks for chatting with me. Bye!");
    }
}
