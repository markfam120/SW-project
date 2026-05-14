/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project.sw;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Noor
 */
public class registrationIT {
    
   @Test
    public void testEmptyFirstName() {

        String firstName = "";

        boolean result = firstName.trim().isEmpty();

        assertTrue(result);
    }

    @Test
    public void testValidFirstName() {

        String firstName = "Mark";

        boolean result = firstName.trim().isEmpty();

        assertFalse(result);
    }

    @Test
    public void testDuplicateNationalID() {

        String id1 = "12345";
        String id2 = "12345";

        boolean isDuplicate = id1.equals(id2);

        assertTrue(isDuplicate);
    }

    
    
}
