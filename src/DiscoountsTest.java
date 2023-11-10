import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscoountsTest {

    @Test
    void checkDiscount() {
        boolean days10 = true;
        boolean special = false;
        int amount = 1100;
        boolean web = true;

        Discoounts d = new Discoounts();
        double expected = 0.09;
        double actual = d.CheckDiscount(days10, special, web, amount);

        assertEquals(expected, actual);
    }
}