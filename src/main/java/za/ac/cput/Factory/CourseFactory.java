package za.ac.cput.Factory;


/* CourseFactory.java
 Factory Class for the Course entity
 Author: Mathew Fortuin -219069514
 Date: 8/08/2022
*/

import org.springframework.util.StringUtils;
import za.ac.cput.Entity.Course;
import za.ac.cput.Util.GenericHelper;

import java.util.LinkedList;

public class CourseFactory
{
    public static Course createCourse(String courseId,String courseName,String courseDescription,String facultyID)
    {


         if(!StringUtils.hasLength(courseId))
             throw new IllegalArgumentException("course ID was not provided.");
         if(!StringUtils.hasLength(courseName))
             throw new IllegalArgumentException("course name was not provided.");
         if(!StringUtils.hasLength(courseDescription))
             throw new IllegalArgumentException("course description was not provided.");
         if(!StringUtils.hasLength(facultyID))
             throw new IllegalArgumentException("faculty ID was not provided.");


        return new Course.Builder()
                .setCourseId("ICT:APD")
                .setCourseName("ICT:Applications Development")
                .setCourseDescription("Programming foundations and business practices regarding software development.")
                .setDepartmentId("ITS03")
                .setSubjectList(new LinkedList())
                .build();


    }
}
