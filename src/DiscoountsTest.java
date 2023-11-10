import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscoountsTest {

    @Test
    void Discount9() {
        boolean days10 = true;
        boolean special = false;
        int amount = 1100;
        boolean web = true;

        Discoounts d = new Discoounts();
        double expected = 0.09;
        double actual = d.CheckDiscount(days10, special, web, amount);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void NoDiscountDays(){
        boolean days10 = false;
        boolean special = true;
        int amount = 759;
        boolean web = true;

        Discoounts d = new Discoounts();
        double expected = 0;
        double actual = d.CheckDiscount(days10,special,web,amount);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void Discount2(){
        boolean days10 = true;
        boolean special = false;
        int amount = 759;
        boolean web = false;

        Discoounts d = new Discoounts();
        double expected = 0.02;
        double actual = d.CheckDiscount(days10,special,web,amount);

        assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    void Discount7(){
        boolean days10 = true;
        boolean special = false;
        int amount = 759;
        boolean web = true;

        Discoounts d = new Discoounts();
        double expected = 0.07;
        double actual = d.CheckDiscount(days10,special,web,amount);

        assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    void Discount4(){
        boolean days10 = true;
        boolean special = false;
        int amount = 1200;
        boolean web = false;

        Discoounts d = new Discoounts();
        double expected = 0.04;
        double actual = d.CheckDiscount(days10,special,web,amount);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void NoDiscountSpecial(){
        boolean days10 = true;
        boolean special = true;
        int amount = 759;
        boolean web = true;

        Discoounts d = new Discoounts();
        double expected = 0;
        double actual = d.CheckDiscount(days10,special,web,amount);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}