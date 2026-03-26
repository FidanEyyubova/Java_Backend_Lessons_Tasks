package Java_Data_Types;

import java.math.BigDecimal;
public class Task05MediumInvoicePrecision {
    public static void main (String[] args){
        double firstValue = 12.5;
        double secondValue = 10.5;
        double thirdValue = 8.5;

        double totalValue = firstValue + secondValue + thirdValue;

        BigDecimal numberOne  = new BigDecimal("12.5");
        BigDecimal secondOne  = new BigDecimal("10.5");
        BigDecimal thirdOne  = new BigDecimal("8.5");

        BigDecimal bigDecimalTotal = numberOne.add(secondOne).add(thirdOne);

        double differenceBetween = bigDecimalTotal.doubleValue() - totalValue;

        System.out.printf("Total Value: %.2f, Big Decimal Total: %.2f, Difference Between Them: %.2f",
                totalValue,bigDecimalTotal,differenceBetween
                );
    }
}
