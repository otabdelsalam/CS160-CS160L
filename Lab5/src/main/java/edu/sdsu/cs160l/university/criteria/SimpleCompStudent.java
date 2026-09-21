package edu.sdsu.cs160l.university.criteria;

import edu.sdsu.cs160l.university.course.Course;
import edu.sdsu.cs160l.university.student.Student;
import edu.sdsu.cs160l.university.student.StudentMajor;

import java.util.Set;

//TODO Implement a advanced validity criteria with the specs below
// remove the false value returned and refer to SimpleCompScienceStudent for inspiration


/**
 * Advanced student strategy is a student strategy
 * A student has
 * at least 3 course and
 * at least 1 course with 2xx level and
 * at least 1 course with 3xx level and
 * student is from compsci or compengineering major
 */
public class SimpleCompStudent implements StudentStrategy {
    @Override
    public boolean isValid(Student student) {
        boolean satisfyMajor = student.getStudentMajor() == StudentMajor.computersci || student.getStudentMajor() == StudentMajor.computereng;
        {
            boolean satisfyClasses = student.getCoursesEnrolled().size() >= 3;
            boolean class2Satisfied = false;
            boolean class3Satisfied = false;
            for (Course c : student.getCoursesEnrolled()) {
                if (c.courseName().contains("2")) {
                    class2Satisfied = true;
                }
                if (c.courseName().contains("3")) {
                    class3Satisfied = true;
                }
            }
            return satisfyMajor && satisfyClasses && class2Satisfied && class3Satisfied;
        }
    }
}