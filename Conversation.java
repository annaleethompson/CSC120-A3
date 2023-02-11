import java.util.Scanner;
import java.lang.*;


class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    int rounds = 0;
    String response = ""; // or {}
    String[] split = response.split(" ");
    StringBuffer transcript = new StringBuffer(" ");

    Scanner userInput = new Scanner(System.in);
    System.out.println("How many conversation rounds do you want?");
    rounds = userInput.nextInt();

    System.out.println("Hi there! What's on your mind?\n");
    transcript.append("Hi there! What's on your mind?\n");

    for (int i = rounds) {
      response = userInput.nextLine();
        if split[0] = "I" || split[0] = "i" {
          System.out.println("You", split[1:0]);
          transcript.append("You", split[1:0], "\n");
        }
        if split[-1] = "Me" || split[-1] = "me"{
          System.out.println(split[0:-1], "you");
          transcript.append(split[0:-1], "you", "\n");
        }
        if split[0] = "Am" || split[0] = "am" {
          System.out.println("Are", split[1:0]);
          transcript.append("Are", split[1:0], "\n");
        }
        if split[0] = "You" || split[0] = "you" {
          System.out.println("I", split[1:0]);
          transcript.append("I", split[1:0], "\n");
        }
        if split[0] = "My" || split[0] = "my" {
          System.out.println("Your", split[1:0]);
          transcript.append("Your", split[1:0], "\n");
        }
        if split[0] = "Your" || split[0] = "you" {
          System.out.println("My", split[1:0]);
          transcript.append("My", split[1:0], "\n");
        }
        if self.split[0] = "Are" || split[0] = "are" {
          System.out.println("Maybe");
          transcript.append("Maybe", "\n")
        }
        else: {
          System.out.println("Hmm, interesting");
          transcript.append("Hmm, interesting");
        }      
    }
  System.out.println("Goodbye!");
      transcript.append("Goodbye!");

      userInput.close();
}

