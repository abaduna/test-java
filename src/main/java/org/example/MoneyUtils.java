package org.example;

import java.math.BigDecimal;

public class MoneyUtils {

    public static String format(Double salary){
        String symbol = "$";

        if (salary < 0) {
            symbol = "-$";
            salary = salary *(-1);
        }
        BigDecimal rounded = BigDecimal.valueOf(salary).setScale(2,BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }
    public static  String fomat(Double salary,String symbol) {
        if (symbol == null){
            throw new IllegalArgumentException();
        }
        if (salary < 0) {
            symbol = "-"+symbol;
            salary = salary *(-1);
        }

        BigDecimal rounded = BigDecimal.valueOf(salary).setScale(2,BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }
}
