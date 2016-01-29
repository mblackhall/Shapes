package com.marcus.inheritance;

import com.marcus.model.Student;

/**
 * @author marcus
 * an interace contains zero oru
 * more empty methods. If you implement the interface in a class then you then provide the boby of the method
 *
 */
 public interface StudentComparable {

    /**
     * if comparison is equal return 0
     * if s1 is considered less than s2 return -1
     * if s1 considered > s1 retun + 1
     * @param s1
     * @param s2
     * @return
     */
    int compareTo(Student s1, Student s2 ) ;

}
