package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTotalExpenditure {
    // You can add more methods here
    public static String[] countExpenses(String[] words) {
        ArrayList<String> expenditure = new ArrayList<String>();
        for (String word : words) {
            if (word.charAt(0) == '$') {
                expenditure.add(word);
            }
        }
        return expenditure.toArray(new String[expenditure.size()]);
    }

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Your expenses while overseas?");
        // TODO: add your code here
        line = in.nextLine();
        String[] words = line.split(" ");
        String[] expenditure = countExpenses(words);
        double sum = 0;
        for (String word : expenditure) {
            sum += Double.parseDouble(word.substring(1));
        }
        System.out.println("Expenses in overseas currency:" + Arrays.toString(expenditure));
        System.out.println("Total in local currency: " + "$" + String.format("%.2f", sum * 1.70));
    }
}
