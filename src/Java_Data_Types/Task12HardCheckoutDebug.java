package Java_Data_Types;

public class Task12HardCheckoutDebug {
    public static void main(String[] args) {
        int discountPercent = 20;
        int price = 100;
        double discountAmount = (double) discountPercent / 100 * price;
        System.out.println("Correct Discount: " + discountAmount);

        String code1 = "SALE2026";
        String code2 = new String("SALE2026");

        boolean isEqual = code1.equals(code2);
        System.out.println("Codes:" + isEqual);

        int maxLimit = Integer.MAX_VALUE;
        int extra = 10;

        if (maxLimit > (Integer.MAX_VALUE - extra)) {
            System.out.println("Error: Limit exceeded!");
        } else {
            int total = maxLimit + extra;
            System.out.println("Total: " + total);
        }
    }
}