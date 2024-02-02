import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm ChatBot. What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! How can I help you today?");
        
        while (true) {
            String input = scanner.nextLine();
            String response = generateResponse(input);
            System.out.println(response);
            if (input.equalsIgnoreCase("bye")) {
                System.out.println("Goodbye! Have a great day, " + name + "!");
                break;
            }
        }
        scanner.close();
    }
    
    public static String generateResponse(String input) {
        // Simple responses based on user input
        if (input.contains("how are you")) {
            return "I'm just a bot, so I'm always fine. How about you?";
        } else if (input.contains("time")) {
            return "I'm sorry, I can't provide real-time information.";
        } else if (input.contains("weather")) {
            return "I'm not equipped to provide weather updates.";
        } else {
            return "I'm sorry, I didn't understand that. Can you please rephrase?";
        }
    }
}
