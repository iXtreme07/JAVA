import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class _JT_Rechner {
    @Test
    public void addierenVon5Und12Ist17()
    {
        Rechner rechner = new Rechner();
        int ergebnis = rechner.addiere(5, 12);
        assertEquals(17, ergebnis);
    }

}
