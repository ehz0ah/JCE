package week3;

public class PrintPrice {
    public static void printPrice(String item) {
        // TODO: add your code here
        int splitIndex = item.indexOf("--");
        String name = item.substring(0, splitIndex).trim().toUpperCase();
        String price = item.substring(splitIndex + 3);
        price = price.replace("/", ".");

        System.out.println(name + ": " + price);
    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}
