import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MethodExercises {

    Scanner in = new Scanner(System.in);

    // Adds two numbers given by the user
    public int addTwoNums(int x, int y) {
        return x + y;
    }

    //Divides two numbers; if the second number is 0 print undefined.
    public void divideTwoNums(int x, int y) {
        if (y == 0) {
            System.out.println("Undefined");
        }
        System.out.println(x + " / " + y + " = " + x/y);
    }

    //Sorts and array list
    public void sortLetters (ArrayList<String> wordList) {
        wordList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a letter: ");
            String s = in.nextLine();
            wordList.add(s);
        }
        Collections.sort(wordList);
        System.out.print("Letters sorted in order: ");
        for (String s : wordList) {
            System.out.print(s + " ");
        }
    }

    //Get the length of a string
    public int strLength(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        return count;
    }

    //Average of three numbers
    public int avgThreeNums(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    //Checks if year is leap year
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    //Counts the words in a sentence
    public int countWords (String sentence) {
        String [] countArray = sentence.split(" ");
        return countArray.length;
    }

    //Area of a rectangle
    public int rectArea (int width, int length) {
        return width * length;
    }

    //Prints out five randoms numbers given a bound
    public void printFiveRandomNums(int bound) {
        System.out.println("Five random numbers with a bound of " + bound);
        for (int i = 0 ; i < 5; i++) {
            Random rand = new Random();
            System.out.print(rand.nextInt(bound) + " ");
        }
    }

    //Print random words from arraylist
    public void printRandomWords(ArrayList<String> stringList) {
        Random rand = new Random();
        System.out.println(stringList.get(rand.nextInt(stringList.size())));
    }

    //Prints out if number is odd or even
    public void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
        System.out.println(num + " is odd");
    }

    //Prints out a letter grade depending on percentage inputted by the user
    public void printGrades(int percent) {
        if (percent >= 90 && percent <= 100) {
            System.out.println("A");
        } else if (percent >= 80 && percent <= 89) {
            System.out.println("B");
        } else if (percent >= 70 && percent <= 79) {
            System.out.println("C");
        } else if (percent >= 60 && percent <= 69) {
            System.out.println("D");
        } else if (percent >= 50 && percent <= 59) {
            System.out.println("F");
        }
    }
}