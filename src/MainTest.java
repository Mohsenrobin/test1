import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MainTest {
    private MainClass main = new MainClass();

    @Test
    void sum() {
        int s = main.sum(2, 3);
        Assertions.assertEquals(5,s);
    }
}