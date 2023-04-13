package Uebung1.src;

import static org.junit.jupiter.api.Assertions.*;

class WarmUpTest {

    @org.junit.jupiter.api.Test
    void ermittlePrimzahlTest() {
        assertEquals(true, WarmUp.ermittlePrimzahl(3));
        assertEquals(false, WarmUp.ermittlePrimzahl(4));
    }

    @org.junit.jupiter.api.Test
    void berechneQuersummeTest() {
        assertEquals(10, WarmUp.berechneQuersumme(433));
        assertEquals(13, WarmUp.berechneQuersumme(2222221));
    }
}