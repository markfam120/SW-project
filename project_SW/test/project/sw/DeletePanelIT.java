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
public class DeletePanelIT {
    
   @Test
    public void testDeleteExistingStudent() {

        StudentDAO dao = new StudentDAO();

        boolean result =
                dao.deleteStudent("245245");

        assertTrue(result);
    }
    @Test
public void testDeleteNonExistingStudent() {

    StudentDAO dao = new StudentDAO();

    boolean result =
            dao.deleteStudent("99999");

    assertFalse(result);
}

    
    
    
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DeletePanel.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
