import org.junit.Test;
import static org.junit.Assert.*;
public class CheckItTest {


    @Test
    public void testPredicateCoverage() {
        assertTrue(CheckIt.checkIt(true, true, true));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testClauseCoverage() {
        assertTrue(CheckIt.checkIt(true, true, true));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testCombinatorialCoverage() {
        assertTrue(CheckIt.checkIt(true, true, true));
        assertTrue(CheckIt.checkIt(true, true, false));
        assertTrue(CheckIt.checkIt(true, false, true));
        assertTrue(CheckIt.checkIt(true, false, false));
        assertTrue(CheckIt.checkIt(false, true, true));
        assertFalse(CheckIt.checkIt(false, true, false));
        assertFalse(CheckIt.checkIt(false, false, true));
        assertFalse(CheckIt.checkIt(false, false, false));
    }
    @Test
    public void RACC() {
        assertTrue(CheckIt.checkIt(true, false, true));
        assertFalse(CheckIt.checkIt(false, false, true));
    }
}
