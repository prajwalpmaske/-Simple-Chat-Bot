# -Simple-Chat-Bot
This Java program implements a simple chatbot that engages in a conversation with the user. Here's a breakdown of what it does:

It imports the Scanner class from java.util package to allow user input.
It defines a class named SimpleChatBot.
Inside the main method, it greets the user, asks for their name, and then enters a loop where it continuously reads user input, generates a response, and prints it.
If the user input is "bye" (case insensitive), it breaks out of the loop and says goodbye.
It defines a method named generateResponse that takes the user input as a parameter and returns a response based on certain conditions:
If the input contains "how are you", it responds with a predefined message about the bot's well-being.
If the input contains "time", it responds that it can't provide real-time information.
If the input contains "weather", it responds that it's not equipped to provide weather updates.
Otherwise, it responds with a generic message asking the user to rephrase.
