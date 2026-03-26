package Java_Arrays_Strings;

public class Task10HardCsvOrderParser {
    public static void main(String[] args) {
        String data = "apple:2,banana:5,orange:3";

        String[] entries = data.split(",");

        String[] items = new String[entries.length];
        int[] quantities = new int[entries.length];
        int totalQuantity = 0;

        for (int i = 0; i < entries.length; i++) {
            String[] parts = entries[i].split(":");

            items[i] = parts[0];
            quantities[i] = Integer.parseInt(parts[1]);

            totalQuantity += quantities[i];
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(String.format("Item: %-10s | Quantity: %d", items[i], quantities[i]));
        }

        System.out.println("-".repeat(30));
        System.out.println(String.format("Total Items in Stock: %d", totalQuantity));
    }
}
