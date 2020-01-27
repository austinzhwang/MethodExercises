import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        MethodExercises me = new MethodExercises();

        //1
        System.out.print("Enter a number: ");
        int n1 = in.nextInt();
        System.out.print("Enter another number: ");
        int n2 = in.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + me.addTwoNums(n1, n2));

        //2
        System.out.println();
        System.out.print("Enter a number: ");
        int n3 = in.nextInt();
        System.out.print("Enter another number: ");
        int n4 = in.nextInt();
        me.divideTwoNums(n3, n4);

        //3
        System.out.println( );
        ArrayList<String> wordList = new ArrayList<>();
        me.sortLetters(wordList);
        in.nextLine();

        //4
        System.out.println();
        System.out.println();
        System.out.print("Enter a string: ");
        String sLen = in.nextLine();
        System.out.println("The length of the string is: " + me.strLength(sLen));

        //5
        System.out.println();
        System.out.print("Enter a number: ");
        int nA = in.nextInt();
        System.out.print("Enter another number: ");
        int nB = in.nextInt();
        System.out.print("Enter another number: ");
        int nC = in.nextInt();
        System.out.println("The average of " + nA + " " + nB + " " + nC + " is: " + me.avgThreeNums(nA, nB, nC) );

        //6
        System.out.println();
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if (me.isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not leap year");
        }
        in.nextLine();

        //7
        System.out.println();
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        System.out.println("There are " + me.countWords(sentence) + " words in the sentence");

        //8
        System.out.println();
        System.out.print("Enter a width: ");
        int w = in.nextInt();
        System.out.print("Enter a length: ");
        int l = in.nextInt();
        System.out.println("The area of the rectangle is: " + me.rectArea(w, l));

        //9
        System.out.println();
        System.out.print("Enter a bound: ");
        int bound = in.nextInt();
        me.printFiveRandomNums(bound);
        in.nextLine();

        //10
        System.out.println();
        System.out.println("A random word from the ArrayList: ");
        ArrayList<String> sList = new ArrayList<>();
        sList.add("module");
        sList.add("class");
        sList.add("implement");
        me.printRandomWords(sList);

        //11
        System.out.println();
        System.out.print("Enter a number: ");
        int evenOrOdd = in.nextInt();
        me.oddOrEven(evenOrOdd);

        //12
        System.out.println();
        System.out.print("Enter a percent grade: ");
        int grade = in.nextInt();
        System.out.print("Letter grade: ");
        me.printGrades(grade);






    }
}
