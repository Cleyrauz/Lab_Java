import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 30);
    }

    @Test
    public void printerHasEnoughPaper() {
        printer.print(2, 2);
        assertEquals(6, printer.getNumSheetsPaperLeft());
    }

    @Test
    public void printerDoesNotHasEnoughPaper() {
        printer.print(6, 2);
        assertEquals(10, printer.getNumSheetsPaperLeft());
    }

    @Test
    public void shouldRefillPrinterPaper() {
        printer.refill(10);
        assertEquals(20, printer.getNumSheetsPaperLeft());
    }

    @Test
    public void onPrintReduceToner() {
        printer.print(2, 3);
        assertEquals(24, printer.getTonerVolume());
    }


}
