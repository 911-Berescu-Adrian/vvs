import domain.Nota;
import domain.Student;
import domain.Tema;
import org.junit.jupiter.api.Test;
import repository.NotaXMLRepository;
import repository.StudentXMLRepository;
import repository.TemaXMLRepository;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.Validator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

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

    @Test
    public void EC_TC_1() {
        // Arrange
        String id = "13414";
        String nume = "Mihai Margineanu";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void EC_TC_2() {
        // Arrange
        String id = null;
        String nume = "Mihai Margineanu";
        int grupa = 934;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void EC_TC_3() {
        // Arrange
        String id = "";
        String nume = "Mihai Margineanu";
        int grupa = 934;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void EC_TC_4() {
        // Arrange
        String id = "1TW5";
        String nume = "Mihai Margineanu";
        int grupa = 934;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void EC_TC_5() {
        // Arrange
        String id = "1TW5";
        String nume = null;
        int grupa = 934;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void EC_TC_6() {
        // Arrange
        String id = "1TW5";
        String nume = "";
        int grupa = 934;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void EC_TC_7() {
        // Arrange
        String id = "1TW5";
        String nume = "Mihai Margineanu";
        int grupa = 934;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void EC_TC_8() {
        // Arrange
        String id = "1TW5";
        String nume = "Mihai Margineanu";
        int grupa = 33;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void EC_TC_9() {
        // Arrange
        String id = "1TW5";
        String nume = "Mihai Margineanu";
        int grupa = 939;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void BVA_TC_1() {
        // Arrange
        String id = "a";
        String nume = "Mihai Margineanu";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_2() {
        // Arrange
        String id = "aaaaaaaaaa";
        String nume = "Mihai Margineanu";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_3() {
        // Arrange
        String id = "";
        String nume = "Mihai Margineanu";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void BVA_TC_4() {
        // Arrange
        String id = "aaaaaa";
        String nume = "Mihai Margineanu";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_5() {
        // Arrange
        String id = "aa";
        String nume = "m";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_6() {
        // Arrange
        String id = "aa";
        String nume = "michael edge";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_7() {
        // Arrange
        String id = "aa";
        String nume = "";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void BVA_TC_8() {
        // Arrange
        String id = "aa";
        String nume = "michael";
        int grupa = 931;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_9() {
        // Arrange
        String id = "aa";
        String nume = "m";
        int grupa = 111;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_10() {
        // Arrange
        String id = "aa";
        String nume = "m";
        int grupa = 110;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void BVA_TC_11() {
        // Arrange
        String id = "aa";
        String nume = "m";
        int grupa = 937;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_12() {
        // Arrange
        String id = "aa";
        String nume = "m";
        int grupa = 938;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
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
    public void BVA_TC_13() {
        // Arrange
        String id = "aa";
        String nume = "m";
        int grupa = 112;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void BVA_TC_14() {
        // Arrange
        String id = "aa";
        String nume = "m";
        int grupa = 936;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        Validator<Student> validator = new StudentValidator();
        StudentXMLRepository studentRepository = new StudentXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Student save(Student student) {
                try {
                    validator.validate(student);
                    return student;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(studentRepository, null, null);

        // Act
        int result = service.saveStudent(id, nume, grupa);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void CFG_TC_1() {
        // Arrange
        String id = "PUY4";
        String description = "miau";
        int startline = 5;
        int deadline = 8;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        TemaValidator validator = new TemaValidator();
        TemaXMLRepository temaRepository = new TemaXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Tema save(Tema tema) {
                try {
                    validator.validate(tema);
                    return tema;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(null, temaRepository  , null);

        // Act
        int result = service.saveTema(id, description, deadline, startline);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void CFG_TC_2() {
        // Arrange
        String id = "PUY4";
        String description = "miau";
        int startline = 9;
        int deadline = 6;
        String xmlFilePath = "students_test.xml";


        // Create actual repository instance
        TemaValidator validator = new TemaValidator();
        TemaXMLRepository temaRepository = new TemaXMLRepository(validator, xmlFilePath) {
            // Override save method to always return null, simulating failure
            @Override
            public Tema save(Tema tema) {
                try {
                    validator.validate(tema);
                    return tema;
                } catch (Exception e) {
                    return null;
                }
            }
        };

        // Create Service instance with actual repository
        Service service = new Service(null, temaRepository  , null);

        // Act
        int result = service.saveTema(id, description, deadline, startline);

        // Assert
        assertEquals(1, result);
    }

}
