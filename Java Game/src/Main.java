
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hi! My name is Case. Welcome 'King of the Knowledge' program.");

        //Getting name from user
        System.out.println("Before starting the program may I learn your name ?");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();

        System.out.println("\nWelcome back " + username + " , " +
                "Below you can see that our game consists of 3 parts, the number of questions in these parts and their scores.\n" +
                "\nPART 1: This part consists of 3 questions and each question is worth 10 points." +
                "\n-In this part, you try to find a word with the initial letter given to you.\n" +
                "\nPART 2: This part consists of 5 questions and each question is worth 25 points." +
                "\n-In this section, you test your knowledge with the question given to you, with 4 options for each question. Ahh, before I forget, you have 50%  chance and a double answer joker.\n" +
                "\nPART 3: This is the last part of our game and here we give you 5 random letters, you add 3 to these letters and try to find the question given to you with these words.\n" +
                "\nI hope it will be an enjoyable game, good luck in advance.");

        //Print the game parts and points
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.println("1.PART");
                    for (int j = 1; j <= 3; j++) {
                        System.out.printf("%10d.Question", j);
                    }
                    System.out.println();
                    for (int k = 0; k < 3; k++) {
                        System.out.printf(" %16s ", "10p");
                    }

                    System.out.println();
                    break;

                case 2:
                    System.out.println("2.PART");

                    for (int j = 1; j <= 5; j++) {
                        System.out.printf("%10d.Question", j);
                    }
                    System.out.println();
                    for (int k = 0; k < 5; k++) {
                        System.out.printf(" %15s   ", "25p");
                    }

                    System.out.println();
                    break;

                case 3:
                    System.out.println("3.PART");
                    System.out.printf("   %15s", "Question");
                    System.out.println();
                    System.out.printf("%15s ", "50p");
                    System.out.println();
            }
        }

        String userStart;
        //Check user wants to start
        do {
            System.out.println("Do you want to start ? Please say 'YES' or 'NO' ");
            Scanner start = new Scanner(System.in);
            userStart = start.nextLine().toUpperCase();
        } while ("NO".equals(userStart));


        System.out.println("Welcome to the PART 1 : Here is the questions.\n");



        //PART 1

        int questionnumber = 1; //Variable for question number

        int price1 = 1; //Calculate the total points in part 1

        String[] Arraypoint1 = new String[3]; //Array for question points that user answered

        int price2 = 0; //Calculate total points in part 2

        String[] Arraypoint2 = new String[5]; //Array for question points that user answered

        int price3 = 1; //Calculate total points in part 3

        String[] Arraypoint3 = new String[1]; //Number of 50% chance in the game


        while (questionnumber <= 3) { // Ensure we only ask 3 questions

            switch (questionnumber) {

                case 1:

                    //Print the question number
                    System.out.println(questionnumber + " . Question");
                    String str = "Eye".toUpperCase();

                    char[] Arraych1 = str.toCharArray();

                    // Print the first character of Question 1 for 4 right to question
                    for (int j = 0; j < 4; j++) {


                        for (int i = 0; i < Arraych1.length; i++) {

                            if (i == 0)
                                System.out.printf("%3s", Arraych1[i]);
                            else {
                                System.out.printf("%3s", "-");
                            }

                        }
                        System.out.println();
                    }

                    String Answer1;

                    //Prompt user for the first word
                    do {
                        System.out.println("Please write with a word that started 'E' and has a 3 characters ");
                        Scanner ansq1 = new Scanner(System.in);
                        Answer1 = ansq1.nextLine().toUpperCase();
                        Answer1 = convertTurkishCharacters.convert(Answer1);
                    } while (!(Answer1.startsWith("E") && Answer1.length() == 3));


                    //Print the first entered word
                    char[] Answerq1 = Answer1.toCharArray();
                    for (int k = 0; k < Answerq1.length; k++) {

                        System.out.printf("%3c", Answerq1[k]);
                    }
                    System.out.println();


                    //Check if the entered word matches "Eye"
                    if (Answer1.equals(str.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str);
                        Arraypoint1[0] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes
                    for (int j = 0; j < 3; j++) {
                        for (int i = 0; i < 3; i++) {
                            if (i == 0) {
                                System.out.printf("%3c", str.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych1[i] == Answerq1[i]) {
                                System.out.printf("%3c", Answerq1[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();

                    }

                    String Answer2;

                    //Prompt user for the second word
                    do {
                        System.out.println("Please write with a word that started 'E' and has a 3 characters ");
                        Scanner ansq1a2 = new Scanner(System.in);
                        Answer2 = ansq1a2.nextLine().toUpperCase();
                        Answer2 = convertTurkishCharacters.convert(Answer2);
                    } while (!(Answer2.startsWith("E") && Answer2.length() == 3));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq1[k]);
                    }
                    System.out.println();

                    //Prompt user for the second word
                    char[] Answerq2 = Answer2.toCharArray();
                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq2[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Eye"
                    if (Answer2.equals(str.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str);
                        Arraypoint1[0] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 2 right to answer
                    for (int j = 0; j < 2; j++) {
                        for (int i = 0; i < 3; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych1[i] == Answerq2[i]) {
                                System.out.printf("%3c", Answerq2[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    String Answer3;
                    //Prompt user for the third word

                    do {
                        System.out.println("Please write with a word that started 'E' and has a 3 characters ");
                        Scanner ansq1a3 = new Scanner(System.in);
                        Answer3 = ansq1a3.nextLine().toUpperCase();
                        Answer3 = convertTurkishCharacters.convert(Answer3);
                    } while (!(Answer3.startsWith("E") && Answer3.length() == 3));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq1[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq2[k]);
                    }
                    System.out.println();

                    //Prompt user for the third word
                    char[] Answerq3 = Answer3.toCharArray();
                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq3[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Eye"
                    if (Answer3.equals(str.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str);
                        Arraypoint1[0] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 1 right to answer
                    for (int j = 0; j < 1; j++) {
                        for (int i = 0; i < 3; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych1[i] == Answerq3[i]) {
                                System.out.printf("%3c", Answerq3[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    //Prompt user for the fourth word



                    String Answer4;
                    do {
                        System.out.println("Please write with a word that started 'E' and has a 3 characters ");
                        Scanner ansq1a4 = new Scanner(System.in);
                        Answer4 = ansq1a4.nextLine().toUpperCase();
                        Answer4 = convertTurkishCharacters.convert(Answer4);
                    } while (!(Answer4.startsWith("E") && Answer4.length() == 3));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq1[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq2[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq3[k]);
                    }
                    System.out.println();

                    //Prompt user for the fourth word
                    char[] Answerq4 = Answer4.toCharArray();
                    for (int k = 0; k < Answerq1.length; k++) {
                        System.out.printf("%3c", Answerq4[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Eye"
                    if (Answer4.equals(str.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str);
                        Arraypoint1[0] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    } else {
                        System.out.println("unfortunately , the correct answer is:");
                        System.out.printf("%3s\n", str.toUpperCase());
                        Arraypoint1[0] = "0p";
                        price1 *= 0;
                        questionnumber++;
                        break;
                    }


                case 2:

                    //Print the question number

                    System.out.println(questionnumber + " . Question");
                    String str2 = "Army".toUpperCase();

                    // Print the first character of Question 2 for 4 right to question
                    char[] Arraych2 = str2.toCharArray();
                    for (int j = 0; j < 4; j++) {


                        for (int i = 0; i < Arraych2.length; i++) {

                            if (i == 0) {
                                System.out.printf("%3s", Arraych2[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    //Prompt user for the first word
                    String Answerq2a1;
                    do {
                        System.out.println("Please write with a word that started 'A' and has a 4 characters ");
                        Scanner ansq2a1 = new Scanner(System.in);
                        Answerq2a1 = ansq2a1.nextLine().toUpperCase();
                        Answerq2a1 = convertTurkishCharacters.convert(Answerq2a1);
                    } while (!(Answerq2a1.startsWith("A") && Answerq2a1.length() == 4));


                    //Print the first entered word
                    char[] Answerq2a = Answerq2a1.toCharArray();
                    for (int k = 0; k < Answerq2a.length; k++) {
                        System.out.printf("%3c", Answerq2a[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Army"
                    if (Answerq2a1.equals(str2.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str2);
                        Arraypoint1[1] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 3 right to answer
                    for (int j = 0; j < 3; j++) {
                        for (int i = 0; i < 4; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str2.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych2[i] == Answerq2a[i]) {
                                System.out.printf("%3c", Answerq2a[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();

                    }

                    //Prompt user for the second word
                    String Answerq2a2;
                    do {

                        System.out.println("Please write with a word that started 'A' and has a 4 characters ");
                        Scanner ansq2a2 = new Scanner(System.in);
                        Answerq2a2 = ansq2a2.nextLine().toUpperCase();
                        Answerq2a2 = convertTurkishCharacters.convert(Answerq2a2);
                    } while (!(Answerq2a2.startsWith("A") && Answerq2a2.length() == 4));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq2a.length; k++) {
                        System.out.printf("%3c", Answerq2a[k]);
                    }
                    System.out.println();

                    //Prompt user for the second word
                    char[] Answerq2b = Answerq2a2.toCharArray();
                    for (int k = 0; k < Answerq2b.length; k++) {
                        System.out.printf("%3c", Answerq2b[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Army"
                    if (Answerq2a2.equals(str2.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str2);
                        Arraypoint1[1] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 2 right to answer
                    for (int j = 0; j < 2; j++) {
                        for (int i = 0; i < 4; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str2.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych2[i] == Answerq2b[i]) {
                                System.out.printf("%3c", Answerq2b[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    //Prompt user for the third word
                    String Answerq2a3;
                    do {
                        System.out.println("Please write with a word that started 'A' and has a 4 characters ");
                        Scanner ansq2a3 = new Scanner(System.in);
                        Answerq2a3 = ansq2a3.nextLine().toUpperCase();
                        Answerq2a3 = convertTurkishCharacters.convert(Answerq2a3);
                    } while (!(Answerq2a3.startsWith("A") && Answerq2a3.length() == 4));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq2a.length; k++) {
                        System.out.printf("%3c", Answerq2a[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq2b.length; k++) {
                        System.out.printf("%3c", Answerq2b[k]);
                    }
                    System.out.println();

                    //Prompt user for the third word
                    char[] Answerq2c = Answerq2a3.toCharArray();
                    for (int k = 0; k < Answerq2c.length; k++) {
                        System.out.printf("%3c", Answerq2c[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Army"
                    if (Answerq2a3.equals(str2.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str2);
                        Arraypoint1[1] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 1 right to answer
                    for (int j = 0; j < 1; j++) {
                        for (int i = 0; i < 4; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str2.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych2[i] == Answerq2c[i]) {
                                System.out.printf("%3c", Answerq2c[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    //Prompt user for the fourth word
                    String Answerq2a4;
                    do {
                        System.out.println("Please write with a word that started 'A' and has a 4 characters ");
                        Scanner ansq2a4 = new Scanner(System.in);
                        Answerq2a4 = ansq2a4.nextLine().toUpperCase();
                        Answerq2a4 = convertTurkishCharacters.convert(Answerq2a4);
                    } while (!(Answerq2a4.startsWith("A") && Answerq2a4.length() == 4));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq2a.length; k++) {
                        System.out.printf("%3c", Answerq2a[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq2b.length; k++) {
                        System.out.printf("%3c", Answerq2b[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq2c.length; k++) {
                        System.out.printf("%3c", Answerq2c[k]);
                    }
                    System.out.println();

                    //Prompt user for the fourth word
                    char[] Answerq2d = Answerq2a4.toCharArray();
                    for (int k = 0; k < Answerq2d.length; k++) {
                        System.out.printf("%3c", Answerq2d[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Army"
                    if (Answerq2a4.equals(str2.toUpperCase())) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str2);
                        Arraypoint1[1] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    } else {
                        System.out.println("unfortunately , the correct answer is:");
                        System.out.printf("%3s\n", str2.toUpperCase());
                        Arraypoint1[1] = "0p";
                        price1 *= 0;
                        questionnumber++;
                        break;
                    }


                case 3:

                    //Print the question number

                    System.out.println(questionnumber + " . Question");
                    String str3 = "Train".toUpperCase();
                    str3 = convertTurkishCharacters.convert(str3);


                    // Print the first character of Question 3 for 4 right to question
                    char[] Arraych3 = str3.toCharArray();
                    for (int j = 0; j < 4; j++) {
                        for (int i = 0; i < Arraych3.length; i++) {

                            if (i == 0) {
                                System.out.printf("%3s", Arraych3[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    //Prompt user for the first word
                    String Answerq3a1;
                    do {
                        System.out.println("Please write with a word that started 'T' and has a 5 characters ");
                        Scanner ansq3a1 = new Scanner(System.in);
                        Answerq3a1 = ansq3a1.nextLine().toUpperCase();
                        Answerq3a1 = convertTurkishCharacters.convert(Answerq3a1);
                    } while (!(Answerq3a1.startsWith("T") && Answerq3a1.length() == 5));


                    //Print the first entered word
                    char[] Answerq3a = Answerq3a1.toCharArray();
                    for (int k = 0; k < Answerq3a.length; k++) {
                        System.out.printf("%3c", Answerq3a[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Train"
                    if (Answerq3a1.equals(str3)) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str3);
                        Arraypoint1[2] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 3 right to answer
                    for (int j = 0; j < 3; j++) {
                        for (int i = 0; i < 5; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str3.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych3[i] == Answerq3a[i]) {
                                System.out.printf("%3c", Answerq3a[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();

                    }

                    //Prompt user for the second word
                    String Answerq3a2;
                    do {
                        System.out.println("Please write with a word that started 'T' and has a 5 characters ");
                        Scanner ansq3a2 = new Scanner(System.in);
                        Answerq3a2 = ansq3a2.nextLine().toUpperCase();
                        Answerq3a2 = convertTurkishCharacters.convert(Answerq3a2);
                    } while (!(Answerq3a2.startsWith("T") && Answerq3a2.length() == 5));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq3a.length; k++) {
                        System.out.printf("%3c", Answerq3a[k]);
                    }
                    System.out.println();

                    //Prompt user for the second word
                    char[] Answerq3b = Answerq3a2.toCharArray();
                    for (int k = 0; k < Answerq3b.length; k++) {
                        System.out.printf("%3c", Answerq3b[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Train"
                    if (Answerq3a2.equals(str3)) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str3);
                        Arraypoint1[2] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 2 right to answer
                    for (int j = 0; j < 2; j++) {
                        for (int i = 0; i < 5; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str3.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych3[i] == Answerq3b[i]) {
                                System.out.printf("%3c", Answerq3b[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    //Prompt user for the third word
                    String Answerq3a3;
                    do {
                        System.out.println("Please write with a word that started 'T' and has a 5 characters ");
                        Scanner ansq3a3 = new Scanner(System.in);
                        Answerq3a3 = ansq3a3.nextLine().toUpperCase();
                        Answerq3a3 = convertTurkishCharacters.convert(Answerq3a3);
                    } while (!(Answerq3a3.startsWith("T") && Answerq3a3.length() == 5));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq3a.length; k++) {
                        System.out.printf("%3c", Answerq3a[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq3b.length; k++) {
                        System.out.printf("%3c", Answerq3b[k]);
                    }
                    System.out.println();

                    //Prompt user for the third word
                    char[] Answerq3c = Answerq3a3.toCharArray();
                    for (int k = 0; k < Answerq3c.length; k++) {
                        System.out.printf("%3c", Answerq3c[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Train"
                    if (Answerq3a3.equals(str3)) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str3);
                        Arraypoint1[2] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    }

                    //Print the first entered word with dashes for left 1 right to answer
                    for (int j = 0; j < 1; j++) {
                        for (int i = 0; i < 5; i++) {

                            if (i == 0) {
                                System.out.printf("%3c", str3.charAt(0));
                            }

                            //Find the common characters
                            else if (Arraych3[i] == Answerq3c[i]) {
                                System.out.printf("%3c", Answerq3c[i]);
                            } else {
                                System.out.printf("%3s", "-");
                            }
                        }
                        System.out.println();
                    }

                    //Prompt user for the fourth word
                    String Answerq3a4;
                    do {
                        System.out.println("Please write with a word that started 'T' and has a 5 characters ");
                        Scanner ansq3a4 = new Scanner(System.in);
                        Answerq3a4 = ansq3a4.nextLine().toUpperCase();
                        Answerq3a4 = convertTurkishCharacters.convert(Answerq3a4);
                    } while (!(Answerq3a4.startsWith("T") && Answerq3a4.length() == 5));


                    //Print the previously entered words
                    for (int k = 0; k < Answerq3a.length; k++) {
                        System.out.printf("%3c", Answerq3a[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq3b.length; k++) {
                        System.out.printf("%3c", Answerq3b[k]);
                    }
                    System.out.println();


                    for (int k = 0; k < Answerq3c.length; k++) {
                        System.out.printf("%3c", Answerq3c[k]);
                    }
                    System.out.println();

                    //Prompt user for the fourth word
                    char[] Answerq3d = Answerq3a4.toCharArray();
                    for (int k = 0; k < Answerq3d.length; k++) {
                        System.out.printf("%3c", Answerq3d[k]);
                    }
                    System.out.println();

                    //Check if the entered word matches "Train"
                    if (Answerq3a4.equals(str3)) {
                        System.out.println("Congratulations! You've guessed the word correctly: " + str3);
                        Arraypoint1[2] = "10p";
                        price1 *= 10;
                        questionnumber++;
                        break;
                    } else {
                        System.out.println("unfortunately , the correct answer is:");
                        System.out.printf("%3s\n", str3.toUpperCase());
                        Arraypoint1[2] = "0p";
                        price1 *= 0;
                        questionnumber++;
                        break;
                    }


            }
        }

        String p1continue;
        System.out.println("Do you want to continue ? Please say 'YES' or 'NO' ");
        Scanner start = new Scanner(System.in);
        p1continue = start.nextLine().toUpperCase();
        if (p1continue.equals("NO")) {
            System.out.println("\nWe are very sorry that you left our competition so early.\n" +
                    "\nHere is your scoreboard and the money you earned:\n");
            for (int i = 1; i <= 3; i++) {
                switch (i) {
                    case 1:
                        System.out.println("1.PART");
                        for (int j = 1; j <= 3; j++) {
                            System.out.printf("%10d.Question", j);
                        }
                        System.out.println();
                        for (int k = 0; k < 3; k++) {
                            System.out.printf(" %16s ", Arraypoint1[k]);
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("2.PART");

                        for (int j = 1; j <= 5; j++) {
                            System.out.printf("%10d.Question", j);
                        }
                        System.out.println();
                        for (int k = 0; k < 5; k++) {
                            System.out.printf(" %15s   ", Arraypoint2[k]);
                        }

                        System.out.println();
                        break;

                    case 3:
                        System.out.println("3.PART");
                        System.out.printf("   %15s", "Question");
                        System.out.println();
                        for (int k = 0; k < 1; k++) {
                            System.out.printf(" %15s   ", Arraypoint3[k]);
                        }
                        System.out.println();

                }
            }

            System.out.println("\nI would like to talk about our scoring system.\n" +
                    "In PART 1, each question carries 10 points and the points are multiplied,\n" +
                    "In PART 2, each question is worth 25 points and the points are added up.\n" +
                    "The question in PART 3 is worth 50 points and the score of this question is multiplied by 100.\n" +
                    "\n" +
                    "At the end of this scoring system, your total score gives you the money you will earn.\n" +
                    "\n");
            System.out.print("Here's the money you earned: ");
            System.out.println((price1 + price2 + price3) + " TL");

            System.exit(0);

        }


//PART 2


        Scanner jokers = new Scanner(System.in);
        String joker;

        int joker50chance = 1; //Number of 50% chance in the game
        int jokerdoublechance = 1; //Number of Double answer chance in the game

        System.out.println("\nWelcome to the PART 2 : Here is the questions");
        //Print 5 question
        for (int i = 1; i <= 5; i++) {
            switch (i) {

                case 1:

                    //Print the first question
                    System.out.println(i + ". Question:" + "\n Which novel includes the character Gregor Samsa?" +
                            "\n A) The Metamorphosis " +
                            "\n B) Letters to Milena " +
                            "\n C) Letter to His Father " +
                            "\n D) A Hunger Artist " +
                            "\n Please write your answer.(If you have , you can use '50% chance' and 'Double answer' HINT: You can not use '50% chance' after using 'Double answer'.)");


                    //Take the answer from user
                    joker = jokers.nextLine();

                    // Check if the input is one of the allowed characters
                    while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                        System.out.println("Please enter a option that are allowed");
                        joker = jokers.nextLine();
                    }


                    //Check if the user wants to use 50% chance injury
                    if (joker.equals("50% chance")) {
                        List<String> options = new ArrayList<>();
                        options.add("A) The Metamorphosis");
                        options.add("B) Letters to Milena");
                        options.add("C) Letter to His Father");
                        options.add("D) A Hunger Artist");

                        // Remove the correct answer to leave only wrong answers
                        List<String> wrongoptions = new ArrayList<>(options);
                        wrongoptions.remove("A) The Metamorphosis");

                        // Shuffle the wrong options to get random selection
                        Collections.shuffle(wrongoptions);

                        // Remove two wrong options randomly
                        wrongoptions.remove(0);
                        wrongoptions.remove(0);


                        // Create final options list with the correct answer
                        List<String> finalOptions = new ArrayList<>();
                        finalOptions.add("A) The Metamorphosis");
                        finalOptions.addAll(wrongoptions);

                        // Ensure A is at the start
                        Collections.sort(finalOptions);

                        //Write the remaining options
                        System.out.println("\nRemaining options:");
                        for (String option : finalOptions) {
                            System.out.println(option);

                        }
                        System.out.println("Please write your answer.");

                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed");
                            joker = jokers.nextLine();
                        }


                        joker50chance = 0;
                    }


                    //Check if the user wants to use Double answer injury
                    if (joker.equals("Double answer")) {
                        jokerdoublechance = 0;
                        System.out.println("Please write your 1st option.");

                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed");
                            joker = jokers.nextLine();
                        }


                        if (joker.equals("A")) {

                            System.out.println("Congratulations , your answer is true.");
                            Arraypoint2[0] = "25p";
                            price2 += 25;
                            break;
                        }
                        else {
                            System.out.println("This answer is not true , please write your 2nd option.");


                            //Take the answer from user
                            joker = jokers.nextLine();

                            // Check if the input is one of the allowed characters
                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                                System.out.println("Please enter a option that are allowed");
                                joker = jokers.nextLine();
                            }


                        }

                    }


                    //Check the user gave true answer or not
                    if ("A".equals(joker)) {
                        System.out.println("Congratulations , your answer is true.");
                        Arraypoint2[0] = "25p";
                        price2 += 25;
                    }
                    else {
                        System.out.println("unfortunately , your answer was not true. The correct answer is 'A'");
                        Arraypoint2[0] = "0p";
                        price2 += 0;
                    }

                    break;


                case 2:
                    //Print the second question
                    System.out.println(i + ". Question:" + "\n Which planet is known as the Red Planet? " +
                            "\n A) Earth " +
                            "\n B) Mars " +
                            "\n C) Jupiter" +
                            "\n D) Venus" +
                            "\n Please write your answer.(If you have , you can use '50% chance' and 'Double answer' HINT: You can not use '50% chance' after using 'Double answer'.)");

                    //Take the answer from user
                    joker = jokers.nextLine();

                    // Check if the input is one of the allowed characters
                    while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                        System.out.println("Please enter an options or jokers that you have");
                        joker = jokers.nextLine();
                    }

                    //Check 50% chance used before
                    if(joker.equals("50% chance") && joker50chance == 0 ){
                        System.out.println("You have used '50% chance'. Please enter an option or use 'Double answer' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter an option or 'Double answer' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check Double answer chance used before
                    if(joker.equals("Double answer") && jokerdoublechance==0){
                        System.out.println("You have used 'Double answer'. Please enter an option or use '50% chance' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance")) {
                            System.out.println("Please enter an option or '50% chance' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check if the user wants to use 50% chance injury
                     if (joker.equals("50% chance") && joker50chance==1) {

                        List<String> options = new ArrayList<>();
                        options.add("A) Earth");
                        options.add("B) Mars");
                        options.add("C) Jupiter");
                        options.add("D) Venus");

                        // Remove the correct answer to leave only wrong answers
                        List<String> wrongoptions = new ArrayList<>(options);
                        wrongoptions.remove("B) Mars");

                        // Shuffle the wrong options to get random selection
                        Collections.shuffle(wrongoptions);

                        // Remove two wrong options randomly
                        wrongoptions.remove(0);
                        wrongoptions.remove(0);


                        // Create final options list with the correct answer
                        List<String> finalOptions = new ArrayList<>();
                        finalOptions.add("B) Mars");
                        finalOptions.addAll(wrongoptions);

                        // Ensure A is at the start
                        Collections.sort(finalOptions);

                        //Write the remaining options
                        System.out.println("\nRemaining options:");

                        for (String option : finalOptions) {
                            System.out.println(option);
                        }

                        System.out.println("Please write your answer.");
                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed.(You have used '50% chance')");
                            joker = jokers.nextLine();
                        }

                            //Check the double answer is used before

                            if(joker.equals("Double answer") && jokerdoublechance== 0){
                                System.out.println("You have used 'Double answer'. Please enter an option. (You have already used '50% chance')");
                                joker = jokers.nextLine();

                                while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                    System.out.println("Please enter a option that are allowed. (You have used '50% chance' and 'Double answer' chance)");
                                    joker = jokers.nextLine();
                                }

                            }
                            joker50chance = 0;
                        }


                    //Check if the user wants to use Double answer injury
                    if (joker.equals("Double answer") && jokerdoublechance == 1) {
                        jokerdoublechance = 0;
                        System.out.println("Please write your 1st option.");

                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed");
                            joker = jokers.nextLine();
                        }


                        //Check the answer that given
                        if (joker.equals("B")) {
                            System.out.println("Congratulations , your answer is true.");
                            Arraypoint2[2] = "25p";
                            price2 += 25;
                            break;
                        }
                        else {
                            System.out.println("This answer is not true , please write your 2nd option.");

                            //Take the answer from user
                            joker = jokers.nextLine();

                            // Check if the input is one of the allowed characters
                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                System.out.println("Please enter an option that are allowed. (You can not use '50% chance' after using 'Double answer' chance)");
                                joker = jokers.nextLine();
                            }

                        }

                    }


                    //Check the user gave true answer or not
                    if ("B".equals(joker)) {
                        System.out.println("Congratulations , your answer is true.");
                        Arraypoint2[1] = "25p";
                        price2 += 25;

                    }
                    else {
                        System.out.println("Unfortunately , your answer was not true. The correct answer is 'B'");
                        Arraypoint2[1] = "0p";
                        price2 += 0;

                    }
                    break;


                case 3:
                    //Print the third question
                    System.out.println(i + ". Question:" + "\n Who painted the Mona Lisa?" +
                            "\n A) Vincent van Gogh" +
                            "\n B) Pablo Picasso" +
                            "\n C) Leonardo da Vinci" +
                            "\n D) Claude Monet" +
                            "\n Please write your answer.(If you have , you can use '50% chance' and 'Double answer' HINT: You can not use '50% chance' after using 'Double answer'.)");

                    //Take the answer from user
                    joker = jokers.nextLine();

                    // Check if the input is one of the allowed characters
                    while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                        System.out.println("Please enter an options or jokers that you have");
                        joker = jokers.nextLine();
                    }

                    //Check 50% chance used before
                    if(joker.equals("50% chance") && joker50chance == 0 ){
                        System.out.println("You have used '50% chance'. Please enter an option or use 'Double answer' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter an option or 'Double answer' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check Double answer chance used before
                    if(joker.equals("Double answer") && jokerdoublechance==0){
                        System.out.println("You have used 'Double answer'. Please enter an option or use '50% chance' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance")) {
                            System.out.println("Please enter an option or '50% chance' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check if the user wants to use 50% chance injury
                    if (joker.equals("50% chance") && joker50chance==1) {
                        joker50chance = 0;

                        List<String> options = new ArrayList<>();
                        options.add("A) Vincent van Gogh");
                        options.add("B) Pablo Picasso");
                        options.add("C) Leonardo da Vinci");
                        options.add("D) Claude Monet");

                        // Remove the correct answer to leave only wrong answers
                        List<String> wrongoptions = new ArrayList<>(options);
                        wrongoptions.remove("C) Leonardo da Vinci");

                        // Shuffle the wrong options to get random selection
                        Collections.shuffle(wrongoptions);

                        // Remove two wrong options randomly
                        wrongoptions.remove(0);
                        wrongoptions.remove(0);


                        // Create final options list with the correct answer
                        List<String> finalOptions = new ArrayList<>();
                        finalOptions.add("C) Leonardo da Vinci");
                        finalOptions.addAll(wrongoptions);

                        // Ensure A is at the start
                        Collections.sort(finalOptions);

                        //Write the remaining options
                        System.out.println("\nRemaining options:");

                        for (String option : finalOptions) {
                            System.out.println(option);
                        }

                        System.out.println("Please write your answer.");
                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed.(You have used '50% chance')");
                            joker = jokers.nextLine();
                        }

                        //Check the double answer is used before

                        if(joker.equals("Double answer") && jokerdoublechance== 0){
                            System.out.println("You have used 'Double answer'. Please enter an option. (You have already used '50% chance')");
                            joker = jokers.nextLine();

                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                System.out.println("Please enter a option that are allowed. (You have used '50% chance' and 'Double answer' chance)");
                                joker = jokers.nextLine();
                            }

                        }

                    }


                    //Check if the user wants to use Double answer injury
                    if (joker.equals("Double answer") && jokerdoublechance == 1) {
                        jokerdoublechance = 0;
                        System.out.println("Please write your 1st option.");

                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed");
                            joker = jokers.nextLine();
                        }


                        //Check the answer that given
                        if (joker.equals("B")) {
                            System.out.println("Congratulations , your answer is true.");
                            Arraypoint2[2] = "25p";
                            price2 += 25;
                            break;

                        }
                        else {
                            System.out.println("This answer is not true , please write your 2nd option.");

                            //Take the answer from user
                            joker = jokers.nextLine();

                            // Check if the input is one of the allowed characters
                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                System.out.println("Please enter an option that are allowed. (You can not use '50% chance' after using 'Double answer' chance)");
                                joker = jokers.nextLine();
                            }

                        }

                    }

                    //Check the user gave true answer or not
                    if (joker.equals("C")) {
                        System.out.println("Congratulations , your answer is true.");
                        Arraypoint2[2] = "25p";
                        price2 += 25;


                    } else {
                        System.out.println("Unfortunately , your answer was not true. The correct answer is 'C'");
                        Arraypoint2[2] = "0p";
                        price2 += 0;

                    }
                    break;

                case 4:
                    //Print the fourth question
                    System.out.println(i + ". Question:" + "\n  What is the tallest mountain in the world?" +
                            "\n A) Mount Kilimanjaro" +
                            "\n B) K2" +
                            "\n C) Mount Everest" +
                            "\n D) Denali" +
                            "\n Please write your answer.(If you have , you can use '50% chance' and 'Double answer' HINT: You can not use '50% chance' after using 'Double answer'.)");

                    //Take the answer from user
                    joker = jokers.nextLine();

                    // Check if the input is one of the allowed characters
                    while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                        System.out.println("Please enter an options or jokers that you have");
                        joker = jokers.nextLine();
                    }

                    //Check 50% chance used before
                    if(joker.equals("50% chance") && joker50chance == 0 ){
                        System.out.println("You have used '50% chance'. Please enter an option or use 'Double answer' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter an option or 'Double answer' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check Double answer chance used before
                    if(joker.equals("Double answer") && jokerdoublechance==0){
                        System.out.println("You have used 'Double answer'. Please enter an option or use '50% chance' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance")) {
                            System.out.println("Please enter an option or '50% chance' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check if the user wants to use 50% chance injury
                    if (joker.equals("50% chance") && joker50chance==1) {
                        joker50chance = 0;
                        List<String> options = new ArrayList<>();
                        options.add("A) Mount Kilimanjaro");
                        options.add("B) K2");
                        options.add("C) Mount Everest");
                        options.add("D) Denali");

                        // Remove the correct answer to leave only wrong answers
                        List<String> wrongoptions = new ArrayList<>(options);
                        wrongoptions.remove("C) Mount Everest");

                        // Shuffle the wrong options to get random selection
                        Collections.shuffle(wrongoptions);

                        // Remove two wrong options randomly
                        wrongoptions.remove(0);
                        wrongoptions.remove(0);


                        // Create final options list with the correct answer
                        List<String> finalOptions = new ArrayList<>();
                        finalOptions.add("C) Mount Everest");
                        finalOptions.addAll(wrongoptions);

                        // Ensure A is at the start
                        Collections.sort(finalOptions);

                        //Write the remaining options
                        System.out.println("\nRemaining options:");

                        for (String option : finalOptions) {
                            System.out.println(option);
                        }

                        System.out.println("Please write your answer.");
                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed.(You have used '50% chance')");
                            joker = jokers.nextLine();
                        }

                        //Check the double answer is used before

                        if(joker.equals("Double answer") && jokerdoublechance== 0){
                            System.out.println("You have used 'Double answer'. Please enter an option. (You have already used '50% chance')");
                            joker = jokers.nextLine();

                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                System.out.println("Please enter a option that are allowed. (You have used '50% chance' and 'Double answer' chance)");
                                joker = jokers.nextLine();
                            }

                        }

                    }


                    //Check if the user wants to use Double answer injury
                    if (joker.equals("Double answer") && jokerdoublechance == 1) {
                        jokerdoublechance = 0;
                        System.out.println("Please write your 1st option.");

                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed");
                            joker = jokers.nextLine();
                        }


                        //Check the answer that given
                        if (joker.equals("B")) {
                            System.out.println("Congratulations , your answer is true.");
                            Arraypoint2[2] = "25p";
                            price2 += 25;
                            break;

                        }
                        else {
                            System.out.println("This answer is not true , please write your 2nd option.");

                            //Take the answer from user
                            joker = jokers.nextLine();

                            // Check if the input is one of the allowed characters
                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                System.out.println("Please enter an option that are allowed. (You can not use '50% chance' after using 'Double answer' chance)");
                                joker = jokers.nextLine();
                            }

                        }

                    }

                    //Check the user gave true answer or not
                    if (joker.equals("C")) {
                        System.out.println("Congratulations , your answer is true.");
                        Arraypoint2[3] = "25p";
                        price2 += 25;

                    } else {
                        System.out.println("Unfortunately , your answer was not true. The correct answer is 'C'");
                        Arraypoint2[3] = "0p";
                        price2 += 0;

                    }

                    break;

                case 5:
                    //Print the fifth question
                    System.out.println(i + ". Question:" + "\n In which year did the Titanic sink?" +

                            "\n A) 1910" +
                            "\n B) 1912" +
                            "\n C) 1915" +
                            "\n D) 1918" +
                            "\n Please write your answer.(If you have , you can use '50% chance' and 'Double answer' HINT: You can not use '50% chance' after using 'Double answer'.)");

                    //Take the answer from user
                    joker = jokers.nextLine();

                    // Check if the input is one of the allowed characters
                    while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                        System.out.println("Please enter an options or jokers that you have");
                        joker = jokers.nextLine();
                    }

                    //Check 50% chance used before
                    if(joker.equals("50% chance") && joker50chance == 0 ){
                        System.out.println("You have used '50% chance'. Please enter an option or use 'Double answer' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter an option or 'Double answer' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check Double answer chance used before
                    if(joker.equals("Double answer") && jokerdoublechance==0){
                        System.out.println("You have used 'Double answer'. Please enter an option or use '50% chance' if you have");
                        joker = jokers.nextLine();

                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance")) {
                            System.out.println("Please enter an option or '50% chance' if you have");
                            joker = jokers.nextLine();
                        }

                    }

                    //Check if the user wants to use 50% chance injury
                    if (joker.equals("50% chance") && joker50chance==1) {
                        joker50chance = 0;
                        List<String> options = new ArrayList<>();
                        options.add("A) 1910");
                        options.add("B) 1912");
                        options.add("C) 1915");
                        options.add("D) 1918");

                        // Remove the correct answer to leave only wrong answers
                        List<String> wrongoptions = new ArrayList<>(options);
                        wrongoptions.remove("B) 1912");

                        // Shuffle the wrong options to get random selection
                        Collections.shuffle(wrongoptions);

                        // Remove two wrong options randomly
                        wrongoptions.remove(0);
                        wrongoptions.remove(0);


                        // Create final options list with the correct answer
                        List<String> finalOptions = new ArrayList<>();
                        finalOptions.add("B) 1912");
                        finalOptions.addAll(wrongoptions);

                        // Ensure A is at the start
                        Collections.sort(finalOptions);

                        //Write the remaining options
                        System.out.println("\nRemaining options:");

                        for (String option : finalOptions) {
                            System.out.println(option);
                        }

                        System.out.println("Please write your answer.");
                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed.(You have used '50% chance')");
                            joker = jokers.nextLine();
                        }

                        //Check the double answer is used before

                        if(joker.equals("Double answer") && jokerdoublechance== 0){
                            System.out.println("You have used 'Double answer'. Please enter an option. (You have already used '50% chance')");
                            joker = jokers.nextLine();

                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                System.out.println("Please enter a option that are allowed. (You have used '50% chance' and 'Double answer' chance)");
                                joker = jokers.nextLine();
                            }

                        }

                    }


                    //Check if the user wants to use Double answer injury
                    if (joker.equals("Double answer") && jokerdoublechance == 1) {
                        jokerdoublechance = 0;
                        System.out.println("Please write your 1st option.");

                        //Take the answer from user
                        joker = jokers.nextLine();

                        // Check if the input is one of the allowed characters
                        while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") && !joker.equals("50% chance") && !joker.equals("Double answer")) {
                            System.out.println("Please enter a option that are allowed");
                            joker = jokers.nextLine();
                        }


                        //Check the answer that given
                        if (joker.equals("B")) {
                            System.out.println("Congratulations , your answer is true.");
                            Arraypoint2[2] = "25p";
                            price2 += 25;
                            break;
                        }
                        else {
                            System.out.println("This answer is not true , please write your 2nd option.");

                            //Take the answer from user
                            joker = jokers.nextLine();

                            // Check if the input is one of the allowed characters
                            while (!joker.equals("A") && !joker.equals("B") && !joker.equals("C") && !joker.equals("D") ) {
                                System.out.println("Please enter an option that are allowed. (You can not use '50% chance' after using 'Double answer' chance)");
                                joker = jokers.nextLine();
                            }

                        }

                    }

                    //Check the user gave true answer or not
                    if ("B".equals(joker)) {
                        System.out.println("Congratulations , your answer is true.");
                        Arraypoint2[4] = "25p";
                        price2 += 25;

                    } else {
                        System.out.println("Unfortunately , your answer was not true. The correct answer is 'B'");
                        Arraypoint2[4] = "0p";
                        price2 += 0;

                    }

            }


        }
        String p2continue;
        System.out.println("Do you want to continue ? Please say 'YES' or 'NO' ");
        Scanner cont = new Scanner(System.in);
        p2continue = cont.nextLine().toUpperCase();
        if (p2continue.equals("NO")) {
            System.out.println("\nWe are very sorry that you left our competition so early." +
                    "\nHere is your scoreboard and the money you earned:\n");
            for (int i = 1; i <= 3; i++) {
                switch (i) {
                    case 1:
                        System.out.println("1.PART");
                        for (int j = 1; j <= 3; j++) {
                            System.out.printf("%10d.Question", j);
                        }
                        System.out.println();
                        for (int k = 0; k < 3; k++) {
                            System.out.printf(" %16s ", Arraypoint1[k]);
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("2.PART");

                        for (int j = 1; j <= 5; j++) {
                            System.out.printf("%10d.Question", j);
                        }
                        System.out.println();
                        for (int k = 0; k < 5; k++) {
                            System.out.printf(" %15s   ", Arraypoint2[k]);
                        }

                        System.out.println();
                        break;

                    case 3:
                        System.out.println("3.PART");
                        System.out.printf("   %15s", "Question");
                        System.out.println();
                        for (int k = 0; k < 1; k++) {
                            System.out.printf(" %15s   ", Arraypoint3[k]);
                        }
                        System.out.println();

                }
            }

            System.out.println("Hi " + username + " , " + "I would like to talk about our scoring system.\n\n" +
                    "First, I would like to talk about our scoring system.\n\n" +
                    "In PART 1, each question carries 10 points and the points are multiplied,\n" +
                    "In PART 2, each question is worth 25 points and the points are added up.\n" +
                    "The question in PART 3 is worth 50 points and the score of this question is multiplied by 100.\n" +
                    "\n" +
                    "At the end of this scoring system, your total score gives you the money you will earn.\n" +
                    "\n");
            System.out.print("Here's the money you earned: ");
            System.out.println((price1 + price2 + price3) + " TL");

            System.exit(0);
        }

//PART 3
            System.out.println("\nWelcome to the PART 3 : FINAL PART " + " Here is the question , Good Luck");


            System.out.println("Here is the question:" +
                    "\n City and District " +
                    "\n - - - - - - - - - - - " +
                    "\n   - - - - - - - - - ");


            // Source array with alphabetical characters
            char[] mainArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

            // Array to store randomly generated characters
            char[] randomArray = new char[5];
            Random random = new Random();

            // Generate 5 unique random characters
            for (int i = 0; i < 5; i++) {
                char randomChar;
                boolean unique;
                do {
                    randomChar = mainArray[random.nextInt(mainArray.length)];
                    unique = true;

                    // Check if randomChar is already in randomArray
                    for (int j = 0; j < i; j++) {
                        if (randomArray[j] == randomChar) {
                            unique = false;
                            break;
                        }
                    }
                } while (!unique);
                randomArray[i] = randomChar;
            }

            //Print randomArray
            System.out.println("The letters that we gave :");
            for (int i = 0; i < 5; i++) {
                System.out.printf("%3s", randomArray[i]);
            }

            System.out.println();
            String c;
            Scanner input = new Scanner(System.in);
            char[] userchars = new char[3];

            //Take values from user 3 times

            for (int i = 0; i < 3; i++) {
                boolean valid ;

                do {
                    valid = true;
                System.out.print("Enter character " + (i + 1) + ": ");
                c = input.next();

                // Convert Turkish characters to English
                c = convertTurkishCharacters.convert(c).toUpperCase();
                userchars[i] = c.charAt(0);

                // Check if the entered character matches any in randomArray
                    for (char randomChar : randomArray) {
                        if (userchars[i] == randomChar) {
                            valid = false;
                            System.out.println("You entered a character that is in the random array, please try again.");
                            c = convertTurkishCharacters.convert(c).toUpperCase();
                            userchars[i] = c.charAt(0);
                        }
                    }
                } while (!valid);
            }

            // Create a new array to hold the combined characters
            char[] combinedArray = new char[randomArray.length + 3];

            // Manually copy original characters to the combined array
            for (int i = 0; i < 5; i++) {
                combinedArray[i] = randomArray[i];
            }

            // Manually add user-entered characters to the combined array
            for (int i = 0; i < userchars.length; i++) {
                combinedArray[randomArray.length + i] = userchars[i];
            }

            // Sort the combined array
            for (int i = 0; i < combinedArray.length; i++) {
                for (int j = i + 1; j < combinedArray.length; j++) {
                    if (combinedArray[j] < combinedArray[i]) {
                        char temp = combinedArray[i];
                        combinedArray[i] = combinedArray[j];
                        combinedArray[j] = temp;
                    }
                }
            }

            // Display the sorted array
            System.out.println("Sorted array with your characters:");
            for (char i = 0; i < combinedArray.length; i++) {
                System.out.printf("%3s", combinedArray[i]);
            }


            String city = "Netherlands";
            String district = "Amsterdam";


            // Function to check and print matching characters
            CheckFunction.checkAndPrintMatches(city, combinedArray, "City");
            CheckFunction.checkAndPrintMatches(district, combinedArray, "District");

            // Prompt for the final answer
            System.out.println("Wow, the time to guess. What is your answer? HINT: Please write your answer in the format 'City - District'.");
            Scanner answ = new Scanner(System.in);
            String answer = answ.nextLine();

            //Check the given answer
            if (answer.equalsIgnoreCase("Netherlands - Amsterdam")) {
                Arraypoint3[0] = "50p";

                System.out.println("CONGRATULATIONS, YOU HAVE COMPLETED THIS COMPETITION.");
                price3 *= 100 * 50;

            } else {
                Arraypoint3[0] = "0p";
                price3 *= 0;
                System.out.println("Unfortunately, you gave a wrong answer. The correct answer is 'Netherlands - Amsterdam'.");
            }

            System.out.println("\nHello " + username + " , " + " I congratulate you on completing all the stages successfully. " +
                    "\nHere is your scoreboard and the money you earned");

            for (int i = 1; i <= 3; i++) {
                switch (i) {
                    case 1:
                        System.out.println("1.PART");
                        for (int j = 1; j <= 3; j++) {
                            System.out.printf("%10d.Question", j);
                        }
                        System.out.println();
                        for (int k = 0; k < 3; k++) {
                            System.out.printf(" %16s ", Arraypoint1[k]);
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("2.PART");

                        for (int j = 1; j <= 5; j++) {
                            System.out.printf("%10d.Question", j);
                        }
                        System.out.println();
                        for (int k = 0; k < 5; k++) {
                            System.out.printf(" %15s   ", Arraypoint2[k]);
                        }

                        System.out.println();
                        break;

                    case 3:
                        System.out.println("3.PART");
                        System.out.printf("   %15s", "Question");
                        System.out.println();
                        for (int k = 0; k < 1; k++) {
                            System.out.printf(" %15s   ", Arraypoint3[k]);
                        }
                        System.out.println();

                }
            }

            System.out.println("\n" +
                    "Firstly, I would like to talk about our scoring system.\n\n" +
                    "In PART 1, each question carries 10 points and the points are multiplied,\n" +
                    "In PART 2, each question is worth 25 points and the points are added up.\n" +
                    "The question in PART 3 is worth 50 points and the score of this question is multiplied by 100.\n" +
                    "\n" +
                    "At the end of this scoring system, your total score gives you the money you will earn.\n" +
                    "\n");
            System.out.print("Here's the money you earned: ");
            System.out.println((price1 + price2 + price3) + " TL");


        }
    }





 




 











