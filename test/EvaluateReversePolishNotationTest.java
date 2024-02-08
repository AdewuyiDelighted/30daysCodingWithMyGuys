import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {
    @Test
    public void testThatFunctionCalculateReversePolishNotationUsingStack(){
        String [] input = {"2","1","+","3","*"};
        int expected = 9;
        assertEquals(expected,EvaluateReversePolishNotation.evaluateReversePolishNotation(input));

    }
    @Test
    public void testThatFunctionCalculateReversePolishNotationUsingStackWithDivisionValue(){
        String [] input = {"4","13","5","/","+"};
        int expected = 6;
        assertEquals(expected,EvaluateReversePolishNotation.evaluateReversePolishNotation(input));

    }
    @Test
    public void testThatFunctionCalculateReversePolishNotationUsingStackWithLongerValues(){
        String [] input = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int expected = 22;
        assertEquals(expected,EvaluateReversePolishNotation.evaluateReversePolishNotation(input));

    }
    @Test
    public void testThatFunctionCalculateReversePolishNotationUsingStackWithLongerValuesAddLetter(){
        String [] input = {"4","3","-"};
        int expected = 1;
        assertEquals(expected,EvaluateReversePolishNotation.evaluateReversePolishNotation(input));

    }


}