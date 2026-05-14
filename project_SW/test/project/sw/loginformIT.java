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
 * @author mark
 */
public class loginformIT {
    
   @Test
    public void testValidLogin() {

        UserDAO dao = new UserDAO();

        User user = dao.loginUser("mark120", "12345");

        assertNotNull(user);
    }

    @Test
    public void testInvalidLogin() {

        UserDAO dao = new UserDAO();

        User user = dao.loginUser("wrong", "wrong");

        assertNull(user);
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        loginform.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
