package test;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static Main main = new Main();
    @Test
    void main() {

    }

    @Test
    void sum() {
        int s = main.sum(2, 3);
        assertEquals(5,s);
    }
}