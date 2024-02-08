import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {
    @Test
    public void testThatFunctionReturnsIndexOfTheUnqiueCharacterInAString(){
        String input = "leetcode";
        int  expected = 0;
        assertEquals(expected,FirstUniqueCharacter.findUniqueCharacter(input));
    }
    @Test
    public void testThatFunctionReturnsIndexOfTheUnqiueCharacterInAStringEvenWhenThereAreLongerWord(){
        String input = "loveleetcode";
        int  expected = 2;
        assertEquals(expected,FirstUniqueCharacter.findUniqueCharacter(input));
    }
    @Test
    public void testThatFunctionReturnsIndexOfTheUnqiueCharacterInAStringEvenWhenThereAreShorterWord(){
        String input = "aabb";
        int  expected = -1;
        assertEquals(expected,FirstUniqueCharacter.findUniqueCharacter(input));
    }


}