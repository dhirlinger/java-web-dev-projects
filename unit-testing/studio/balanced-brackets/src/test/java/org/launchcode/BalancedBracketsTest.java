package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void hasOneSetBalancedBracketsWithCharsInBetween(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Please]"));
    }
    @Test
    public void twoLeftoneRightReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void twoFlippedReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void oneBalancedPairOneNotReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void twoBalancedPairOneNotReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]["));
    }
    @Test
    public void oneBalancedOneNotWithTextReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[L]R]5[7"));
    }

}