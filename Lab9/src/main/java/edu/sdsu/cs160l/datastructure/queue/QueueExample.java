package edu.sdsu.cs160l.datastructure.queue;

import edu.sdsu.cs160l.student.*;
import jdk.javadoc.internal.tool.JavadocTodo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * In class explanation + demonstration
 * Note a queue in java is implemented as a {@link java.util.LinkedList}
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add an element - takes O(1)
        queue.add(1);
        queue.offer(2);

        //check top most element takes O(1) time
        Integer top = queue.peek();

        //remove element take O(1) time
        Integer ele = queue.poll();

        queue.clear();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // TODO - Create a queue of students 5 students
        Queue<Student> studentQueue = new LinkedList<>();
        // TODO - initialise 5 students and add them to the queue
        Student student1 = new Student(131702750L, "Omar Abdelsalam", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student student2 = new Student(123456789L, "Tyler Howard", 3.9, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        Student student3 = new Student(134576891L, "Jacob DeGuzman", 4.0, StudentLevel.FRESHMAN, StudentMajor.MATH);
        Student student4 = new Student(198765432L, "William Beasley", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_ENGINEERING);
        Student student5 = new Student(987123456L, "Jack Dowell", 3.8, StudentLevel.FRESHMAN, StudentMajor.PHYSICS);
        studentQueue.add(student1);
        studentQueue.add(student2);
        studentQueue.add(student3);
        studentQueue.add(student4);
        studentQueue.add(student5);
        // TODO - remove the first two students and add 1 student
        studentQueue.poll(); //or studentQueue.remove();
        studentQueue.poll();
        studentQueue.add(student1);
        // TODO - print the final queue
        while(!studentQueue.isEmpty()) {
            System.out.println(studentQueue.poll());
        }




    }
}
