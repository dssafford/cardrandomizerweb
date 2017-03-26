package com.doug.controllers;

/**
 * Created by doug on 3/21/17.
 */

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class StudyGroupTest {
	@Test
	public void getStudent() throws Exception {
		final List<Student> testStudents = new ArrayList<Student>();
		testStudents.add(new Student(1, "Student No.1", 60));
		testStudents.add(new Student(2, "Student No.2", 70));
		testStudents.add(new Student(3, "Student No.2", 80));

		// Start the unit test
		final StudyGroup testGroup = new StudyGroup();
		for(Student student: testStudents) {
			testGroup.addStudent(student);
		}
		assertEquals(testGroup.getStudent(1).getName(), testStudents.get(0).getName());

	}

	@Test
	public void testStudyGroupClass() {
		// prepare the data for test
		final List<Student> testStudents = new ArrayList<Student>();
		testStudents.add(new Student(1, "Student No.1", 60));
		testStudents.add(new Student(2, "Student No.2", 70));
		testStudents.add(new Student(3, "Student No.2", 80));

		// Start the unit test
		final StudyGroup testGroup = new StudyGroup();
		for(Student student: testStudents) {
			testGroup.addStudent(student);
		}
		assertEquals(testGroup.getGroupSize(), testStudents.size());

		Student testStudent = testStudents.get(0);
		Student returnedStudent = testGroup.getStudent(testStudent.getId());
		Assert.assertSame(returnedStudent, testStudent);
		assertEquals(returnedStudent.getId(), testStudent.getId());
		assertEquals(returnedStudent.getName(), testStudent.getName());
		assertEquals(returnedStudent.getScore(), testStudent.getScore());

		testGroup.removeStudent(testStudent.getId());
		assertEquals(testGroup.getGroupSize(), testStudents.size() - 1);

		testGroup.clear();
		assertEquals(testGroup.getGroupSize(), 0);
	}
}