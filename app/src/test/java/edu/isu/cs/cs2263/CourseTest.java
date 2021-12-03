/**
 * This class tests the 2263-homework02-solution Course class.
 *
 * @author Paul Gilbreath
 */

package edu.isu.cs.cs2263.hw02;

import edu.isu.cs.cs2263.hw02.data.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    /**
     * Normally we don't write test cases for the getters and setters, so there is only toString method in Course class.
     * Tested the setters just to up my % tested. Everything else is related to the UI and will be tested via TestFX.
     */
    @BeforeEach
    void setUp() {
        course = new Course("TestCourse", "TC", 101, 3);
        System.out.println();
    }

    @Test
    @DisplayName("test course toString")
    void testToString() {
        assertEquals("TC 101 TestCourse (3)", course.toString(),
                "Test toString: FAILED");
    }

    @Test
    @DisplayName("test set number")
    void testSetNumber() {
        course.setNumber(102);
        assertEquals(102, course.getNumber(), "Test setNumber: FAILED");
    }

    @Test
    @DisplayName("test set name")
    void testSetName() {
        course.setName("NewTestCourse");
        assertEquals("NewTestCourse", course.getName(), "Test setNumber: FAILED");
    }

    @Test
    @DisplayName("test set credits")
    void testSetCredits() {
        course.setCredits(4);
        assertEquals(4, course.getCredits(), "Test setNumber: FAILED");
    }

    @Test
    @DisplayName("test set code")
    void testSetCode() {
        course.setCode("NTC");
        assertEquals("NTC", course.getCode(), "Test setNumber: FAILED");
    }
}
