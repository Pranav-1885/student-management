package com.example.student_management;

import com.example.student_management.model.Student;
import com.example.student_management.service.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testAddStudent() {
        StudentService service = new StudentService();

        Student student = new Student(null, "Pranav", "pranav@example.com");

        Student result = service.addStudent(student);

        assertEquals(1L, result.getId());
        assertEquals("Pranav", result.getName());
        assertEquals("pranav@example.com", result.getEmail());
    }
}