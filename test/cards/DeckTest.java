/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qamar
 */
public class DeckTest {
    
    public DeckTest() {
    }
  

   
    /**
     * Test of generateDeck method, of class Deck.
     
    @Test
    public void testGenerateDeck() {
        System.out.println("generateDeck");
        Deck instance = new Deck();
        instance.generateDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of handValue method, of class Deck.
     */
    @Test
    public void testHandValueGood() {
        System.out.println("handValue Good");
        Deck playerDeck = new Deck();
        boolean expResult = true ;
        boolean result;
        int handValue = playerDeck.handValue();
        if(handValue == 0) {
        result=true;
    } else {
    
        result=false;
    }
        assertEquals(expResult, result);
    
    
    }
    // end of good test
    
    /**
     * Test of handValue method, of class Deck.
     */
    @Test
    public void testHandValueBad() {
        System.out.println("handValue Good");
        Deck playerDeck = new Deck();
        boolean expResult = false ;
        boolean result;
        int handValue = playerDeck.handValue();
        if(handValue == 0) {
        result=false;
    } else {
    
        result=true;
    }
        assertEquals(expResult, result);
    
    
    }
    
    /**
     * Test of handValue method, of class Deck.
     */
    @Test
    public void testHandValueBoundary() {
        System.out.println("handValue Boundary");
        Deck playerDeck = new Deck();
        boolean expResult = true ;
        boolean result;
        int handValue = playerDeck.handValue();
        if(handValue == 0) {
        result=true;
    } else {
    
        result=false;
    }
        assertEquals(expResult, result);
    
    
    }
//end of boundary test

}
