import org.junit.jupiter.api.Test;
import ua.university.Student;
import ua.university.StudentRegistry;

import static org.junit.jupiter.api.Assertions.*;


public class StudentRegistryTest {
    @Test
    void testRemoveByIdRemovesFromMapAndSet(){
        StudentRegistry registry = new StudentRegistry();
        Student s = new Student("111", "Student_demo", "student1@mail.com");
        registry.addStudent(s);

        assertTrue(registry.removeById("111"));
        assertNull(registry.findById("111"));
        assertFalse(registry.containsEmail("student1@mail.com"));

    }
    @Test
    void testEmailCanBeReusedAfterRemoval() {
        StudentRegistry registry = new StudentRegistry();
        Student s1 = new Student("1", "Student1_demo", "student1@mail.com");
        registry.addStudent(s1);
        registry.removeById("1");

        Student s2 = new Student("2", "Student2_demo", "student2@mail.com");
        assertTrue(registry.addStudent(s2)); // email знову доступний
    }

    @Test
    void testRemoveNonExistingId() {
        StudentRegistry registry = new StudentRegistry();
        assertFalse(registry.removeById("999999")); // не існує
    }
}
