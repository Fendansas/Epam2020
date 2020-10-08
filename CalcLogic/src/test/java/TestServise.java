import by.danilchik.CalcLogic;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestServise {

    CalcLogic calcLogic = new CalcLogic();
    @Test
    public void testPlus_positiveFlow() {
        // GIVEN
        double expectedResult = 10;

        //WHEN
        double calculationResult = calcLogic.plus(5, 5);

        // THEN
        assertEquals(expectedResult, calculationResult, 0);
    }

    @Test
    public void testPlus_negativeFlow() {
        // GIVEN
        double expectedResult = 11;

        //WHEN
        double calculationResult = calcLogic.plus(5, 5);

        // THEN
        assertNotEquals(expectedResult, calculationResult, 0);
    }

    @Test
    public void testMinus_positiveFlow(){
        // GIVEN
        double expectedResult = 0;

        //WHEN
        double calculationResult = calcLogic.minus(5, 5);

        // THEN
        assertEquals(expectedResult, calculationResult, 0);

    }


    @Test
    public void testMinus_negativeFlow(){
        // GIVEN
        double expectedResult = 11;

        //WHEN
        double calculationResult = calcLogic.minus(5, 5);

        // THEN
        assertNotEquals(expectedResult, calculationResult, 0);

    }

    @Test
    public void testShare_positiveFlow(){
        // GIVEN
        double expectedResult = 1;

        //WHEN
        double calculationResult = calcLogic.share(5, 5);

        // THEN
        assertEquals(expectedResult, calculationResult, 0);

    }


    @Test
    public void testShare_negativeFlow(){
        // GIVEN
        double expectedResult = 15;

        //WHEN
        double calculationResult = calcLogic.share(5, 5);

        // THEN
        assertNotEquals(expectedResult, calculationResult, 0);

    }

    @Test
    public void testMultiply_positiveFlow(){
        // GIVEN
        double expectedResult = 25;

        //WHEN
        double calculationResult = calcLogic.multiply(5, 5);

        // THEN
        assertEquals(expectedResult, calculationResult, 0);

    }


    @Test
    public void testMultiply_negativeFlow(){
        // GIVEN
        double expectedResult = 15;

        //WHEN
        double calculationResult = calcLogic.multiply(5, 5);

        // THEN
        assertNotEquals(expectedResult, calculationResult, 0);

    }


}
