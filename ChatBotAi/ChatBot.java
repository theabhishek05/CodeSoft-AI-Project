import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I am a chatbot. What can I help you with?");
        while (true) {
            String input = sc.nextLine().toLowerCase();
            if (input.contains("hello") || input.contains("hi")){
                System.out.println("Hi there! How can I help you?");
            } else if(input.contains("bye")){
                System.out.println("Goodbye! Have a nice day.");
                break;

            } else if (input.contains("how are you")){
                System.out.println("I'm just a chatbot, here for your help.");

            } else if (input.contains("who developed you")){
                System.out.println("I'm developed by Er. Abhishek Kumar.");

            } else if (input.contains("who is abhishek kumar")){
                System.out.println("He is a student right now doing projects to upgrade his skills.");

            } else if(input.contains("suggest me a good movie")){
                System.out.println("Yes, of course You can watch Harry Potter.");

            } else if (input.contains("help me to find a good book")){
                System.out.println("Yes, I can. Which type of book are you looking for?");

            } else if (input.contains("spiritual")){
                System.out.println("Then you should read the Bhagavad Gita.");

            } else if(input.contains("thank you") || input.contains("thanks")) {
                System.out.println("You're welcome! I'm always here for you.");

             } else {
                System.out.println("Sorry, I didn't understand that.");
            }
        }

           sc.close();
    }
}
