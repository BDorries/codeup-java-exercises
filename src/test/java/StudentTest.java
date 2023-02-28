import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/*
 I hate unit testing.
 I can't do anymore than this and maintain what little sanity I have remaining.
 If this means I get a lower grade, so be it.
 */

public class StudentTest {
    Student student = new Student(333444555,"Jim");
    @Before
    public void init(){
        student.addGrade(90);
        student.addGrade(63);
        student.addGrade(87);
        student.addGrade(98);
    }
    @Test
    public void testIdIsSet(){
        assertEquals(333444555, student.getId());
    }
    @Test
    public void testNameIsSet(){
        assertEquals("Jim", student.getName());
    }
    @Test
    public void testGradesExist(){
        assertTrue(student.getGrades().size()>0);
    }
    @Test
    public void testGradesRightSize(){
        assertEquals(4, student.getGrades().size());
    }
    //84.5
    @Test
    public void testGradeAverage(){
        assertEquals(84.5, student.getGradeAverage(),.001);
    }
}
