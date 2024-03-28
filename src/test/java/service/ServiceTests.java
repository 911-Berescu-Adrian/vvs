package service;

import domain.Student;
import org.junit.jupiter.api.Test;
import repository.StudentXMLRepository;
import validation.StudentValidator;
import validation.Validator;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTests {
    @Test
    public void testSaveStudent_ReturnsGroup() {
        // Arrange
        String id = "1";
        String nume = "Silviu Faiar";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                return null;
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(1, result);

    }

    @Test
    public void testSaveStudent_WhenSaveFails_ReturnsOne() {
        // Arrange
        String id = "4";
        String nume = "Mihai Margineanu";
        int grupa = 934;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                return null;
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(1, result);

    }

}