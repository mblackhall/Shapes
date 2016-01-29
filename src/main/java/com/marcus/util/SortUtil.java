package com.marcus.util;

import com.marcus.inheritance.StudentComparable;
import com.marcus.model.Student;

/**
 * @author marcus
 */
public class SortUtil {

    public static void sortStudents(Student[] students, StudentComparable compare){

        boolean sorted = false;
        Student temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < students.length - 1; i++) {
                int swap = compare.compareTo(students[i],students[i+1]);

                if ( swap == 0){
                    // elements same no swap needed
                    continue;
                } else if ( swap == -1) {  // considered less that
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = false;
                }   // swap == 1 so they already in order
            }
        }
    }

}
