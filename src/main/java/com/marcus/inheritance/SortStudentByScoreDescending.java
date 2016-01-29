package com.marcus.inheritance;

import com.marcus.model.Student;

/**
 * @author marcus
 */
public class SortStudentByScoreDescending implements StudentComparable {
    @Override
    public int compareTo(Student s1, Student s2) {

        if ( s1.getScore() == s2.getScore()){
            return 0;
        }
        // we want sort ascending so ensure swap by returning -1
        if ( s1.getScore() < s2.getScore() ){
            return -1;
        }

        return 1;
    }
}
