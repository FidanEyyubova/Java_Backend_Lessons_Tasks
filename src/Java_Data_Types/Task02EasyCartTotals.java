package Java_Data_Types;

public class Task02EasyCartTotals {
    public static void main (String[] args){
        int firstProductQuantity = 3;
        double firstUnitPrice = 8.50;

        int secondProductQuantity = 6;
        double secondUnitPrice = 6.50;

        int thirdProductQuantity = 9;
        double thirdUnitPrice = 4.50;

        double deliveryFee = 5;
        double platformFee = 3;
        double couponDiscount = 1.50;

        double finalTotal = (firstProductQuantity * firstUnitPrice) +
                (secondProductQuantity * secondUnitPrice) +
                (thirdProductQuantity * thirdUnitPrice);

        finalTotal += deliveryFee;
        finalTotal += platformFee;

        finalTotal -= couponDiscount;

        System.out.printf(
                "Delivery Fee: $%.2f | Platform Fee: $%.2f | Coupon Discount: -$%.2f | Final Total: $%.2f%n",
                deliveryFee, platformFee, couponDiscount, finalTotal
        );
    }
}
