import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class letterstest {
    @Test
    public void letterPrinter(){
        AtomicInteger testInt=new AtomicInteger(0);
        printer x = new printer();
        char test = x.letterPrinter(testInt);
        assertEquals('a',test);
    }
}