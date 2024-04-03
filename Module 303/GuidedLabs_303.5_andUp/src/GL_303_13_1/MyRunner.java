package GL_303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            String location = "C:/Users/ASU/Desktop/TestingFolderOutputJava/CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file); //Passing the File object to Scanner instance
            ArrayList<Course> data = new ArrayList<>(); //ArrayList of Course type

            while(input.hasNextLine()) { //while there is an existing line in the file
                String line = input.nextLine(); //reads the line
                //splits the line and puts each word (separated by comma) into an array
                String[] splittedLine = line.split(",");

                Course courseObj = new Course();
                courseObj.setCode(splittedLine[0]); //sets the code of the TEXT into the code INSTANCE VARIABLE of the COURSE OBJECT using the - STRING ARRAY that has all the data as ELEMENTS INSIDE THE ARRAY
                courseObj.setCourse_name(splittedLine[1]);
                courseObj.setInstructor_name(splittedLine[2]);

                data.add(courseObj); //adding the "courseObj" inside the ArrayList because its of type "COURSE"
            }

            for(Course course : data) { //for each Course object in the ArrayList
                System.out.println(course.getCode() + " | " + course.getCourse_name() + " | " + course.getInstructor_name());
                System.out.println("=".repeat(60));
            }

        } catch(Exception e) {
            System.out.println("FILE NOT FOUND!");
            e.printStackTrace();
        }

        System.out.println("End of program");
    }
}
