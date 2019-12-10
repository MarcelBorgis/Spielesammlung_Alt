package LogIn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegTest {

    Reg reg = new Reg();

    @Test
    public void laengenTest(){
        assertEquals(true, reg.laenge("12345678"));
        assertEquals(false, reg.laenge("1234567"));
    }

}