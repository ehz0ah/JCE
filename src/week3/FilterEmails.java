package week3;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterEmails {
    public static String[] filterEmails(String[] items){
        // TODO: add your code here
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("@")) {
                list.add(items[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void printItems(String[] items){
        // TODO: add your code here
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        printItems(filterEmails(new String[]{}));
        printItems(filterEmails(new String[]{"abc"}));
        printItems(filterEmails(new String[]{"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[]{"xyz", "@bee.com", "aab"}));
    }
}
