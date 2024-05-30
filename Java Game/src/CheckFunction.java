import java.util.Scanner;
public class CheckFunction {

        public static void main(String[] args) {
            // Example values for testing
            String city = "Netherlands";
            String district = "Amsterdam";
            char[] combinedArray = (city + district).toCharArray();

            // Function to check and print matching characters
            checkAndPrintMatches(city, combinedArray, "Country");
            checkAndPrintMatches(district, combinedArray, "City");

            // Prompt for the final answer
            System.out.println("Wow, the time to guess. What is your answer? HINT: Please write your answer in the format 'Country - City'.");
            Scanner answ = new Scanner(System.in);
            String answer = answ.nextLine();

            if (answer.equalsIgnoreCase("Netherlands - Amsterdam")) {
                System.out.println("CONGRATULATIONS, YOU HAVE COMPLETED THIS COMPETITION.");
            } else {
                System.out.println("Unfortunately, you gave a wrong answer. The correct answer is 'Netherlands - Amsterdam'.");
            }
        }

        // Function to check and print matching characters
        public static void checkAndPrintMatches(String word, char[] availableChars, String label) {
            System.out.println("\nMatching letters in the " + label + ":");
            char[] wordChars = word.toCharArray();
            boolean[] matchedChars = new boolean[wordChars.length];

            for (int i = 0; i < wordChars.length; i++) {
                for (char ac : availableChars) {
                    if (Character.toLowerCase(wordChars[i]) == Character.toLowerCase(ac)) {
                        matchedChars[i] = true;
                        break;
                    }
                }
            }

            for (int i = 0; i < wordChars.length; i++) {
                if (matchedChars[i]) {
                    System.out.print(wordChars[i] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }


