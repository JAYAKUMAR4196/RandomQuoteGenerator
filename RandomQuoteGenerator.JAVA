import java.util.Random;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        // Array of quotes
        String[] quotes = {
            "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
            "The way to get started is to quit talking and begin doing. - Walt Disney",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "Spread love everywhere you go. Let no one ever come to you without leaving happier. - Mother Teresa",
            "In the middle of every difficulty lies opportunity. - Albert Einstein",
            "Do not watch the clock. Do what it does. Keep going. - Sam Levenson",
            "If life were predictable it would cease to be life, and be without flavor. - Eleanor Roosevelt",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "Your time is limited, so don't waste it living someone else's life. - Steve Jobs",
            "Believe you can and you're halfway there. - Theodore Roosevelt"
        };

        // Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);

        // Display a random quote
        System.out.println("Here's a random quote for you:");
        System.out.println(quotes[randomIndex]);
    }
}
