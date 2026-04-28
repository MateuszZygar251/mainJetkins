package pl.zajecia.dodawanie;

import org.junit.Test;
import static org.junit.Assert.*;

public class DodawanieApplicationTest {

    @Test
    public void add() {
        DodawanieApplication app = new DodawanieApplication();
        assertEquals(10, app.add(5, 5));
    }
}