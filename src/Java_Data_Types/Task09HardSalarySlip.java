package Java_Data_Types;

import java.math.BigDecimal;

public class Task09HardSalarySlip {
    public static void main (String[] args){
        final BigDecimal taxRate = new BigDecimal("0.15");
        final BigDecimal pensionRate = new BigDecimal("0.4");

        BigDecimal baseSalary = new BigDecimal("1200");
        BigDecimal overTimePay = new BigDecimal("200");
        BigDecimal bonusPay = new BigDecimal("100");

        BigDecimal grossSalary = baseSalary.add(overTimePay).add(bonusPay);
        BigDecimal taxSalary = grossSalary.multiply(taxRate);
        BigDecimal pensionSalary = grossSalary.multiply(pensionRate);

        BigDecimal netSalary = grossSalary.subtract(taxSalary).subtract(pensionSalary);

        System.out.printf("Gross Salary: %.2f, Tax Salary: %.2f, Pension Salary: %.2f, Net Salary: %.2f",
                grossSalary,taxSalary,pensionSalary,netSalary
                );

    }
}
