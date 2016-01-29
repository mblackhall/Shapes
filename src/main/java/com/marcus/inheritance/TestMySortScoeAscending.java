package com.marcus.inheritance;

import com.marcus.model.Student;
import com.marcus.util.SortUtil;

/**
 * @author marcus
 */
public class TestMySortScoeAscending {

    public static void main(String[] args) {

        Student s1 = new Student("bob",15);
        Student s2 = new Student("annie schmidt",10);
        Student s3 = new Student("fred",4.5);
        Student s4 = new Student("tom",90.888);
        Student s5 = new Student("susan smith",85.68);

        Student[] students = new Student[]{s1,s2,s3,s4,s5};

        // create an instance of your class implenting the Student interface

        // in java you can use assign an integer4 reference to any class that implements it..

        StudentComparable sorttByScoreDescending = new SortStudentByScoreDescending();

        // the sort utils method has StudentCOmparable as a pareter so just pass it in

        SortUtil.sortStudents(students,sorttByScoreDescending);

        for (Student s : students){

            System.out.format("Name : %15s : Score %6.2f\n",s.getName(),s.getScore());
        }

        SortUtil.sortStudents(students, new StudentComparable() {
            @Override
            public int compareTo(Student s1, Student s2) {
                if ( s1.getScore() >  s2.getScore() ){
                    return -1;
                }

                return 0;
            }
        });
        System.out.println("sort ascending *** ");
        for (Student s : students){

            System.out.format("Name : %15s : Score %6.2f\n",s.getName(),s.getScore());
        }

    }
}
