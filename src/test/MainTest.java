package test;

import main.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MainTest {
    private Main main = new Main();

    @Test
    void sum() {
        int s = main.sum(2, 3);
        Assertions.assertEquals(5,s);
    }
}