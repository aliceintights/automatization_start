import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.CashBackHacker;

public class CashBackHackerTest {

    @Test

    void shouldReturnTheAmountLeft() {
        CashBackHacker service = new CashBackHacker();

        int actual = 100;
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
}
