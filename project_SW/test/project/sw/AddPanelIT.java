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
public class AddPanelIT {
    
  @Test
public void testAddStudent() {

    StudentDAO dao = new StudentDAO();

    Student s = new Student(
        "nour",
        "mohamed",
        "21022006",
        "1234",
        "Male",
        "BIS"
    );

    boolean result = dao.addStudent(s);

    assertTrue(result);
}
    
}
