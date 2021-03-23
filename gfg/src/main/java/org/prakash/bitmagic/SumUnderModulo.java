package org.prakash.bitmagic;

import java.math.BigDecimal;
import java.math.MathContext;

public class SumUnderModulo {
    public static void main(String[] args) {
        //BigDecimal a = BigDecimal.valueOf((long)9223372036854775807 + "") % (Math.pow(10, 9) + 7);
       // BigDecimal b = 9223372036854775807;
        System.out.println(sumUnderModulo("9223372036854775807", "9223372036854775807"));

    }

    public static long sumUnderModulo(String a, String b) {
        double n = Math.pow(10, 9) + 7;
        MathContext mc = new MathContext(10);
        BigDecimal value = (BigDecimal.valueOf(Double.valueOf(a)).add(BigDecimal.valueOf(Double.valueOf(b)))).remainder(BigDecimal.valueOf(n), mc);

        BigDecimal value1 = BigDecimal.valueOf(Double.valueOf(a)).remainder(BigDecimal.valueOf(n), mc);
        BigDecimal value2 = BigDecimal.valueOf(Double.valueOf(b)).remainder(BigDecimal.valueOf(n), mc);
        return value1.add(value2).remainder(BigDecimal.valueOf(n), mc).longValue();

       // return value.longValue();

       /* return (long)
                (
                        (
                                 (BigDecimal.valueOf(Double.valueOf(a)).remainder(BigDecimal.valueOf(Double.valueOf(n))))
                             .add (BigDecimal.valueOf(Double.valueOf(b)).remainder(BigDecimal.valueOf(Double.valueOf(n))))

                        ).remainder(BigDecimal.valueOf(Double.valueOf(n)))
                                );*/
    }

}
