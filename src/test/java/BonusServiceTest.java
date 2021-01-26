import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouCalculeteRegistredAndUnderLimit() {
        BonusService service = new BonusService ();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculete(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouCalculeteRegistredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculete(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouCalculeteNoRegistredAndUnderLimit() {
        BonusService service = new BonusService ();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculete(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouCalculeteNoRegistredAndOverLimit() {
        BonusService service = new BonusService ();

        long amount = 100_000_500;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculete(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouCalculeteIsNull() {
        BonusService service = new BonusService ();

        long amount = 0;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculete(amount, registered);

        assertEquals(expected, actual);

    }
}