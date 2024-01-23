package jpa.guc.entity;

import java.io.Serializable;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jpa.guc.res.Name;

@Entity
@SuppressWarnings("serial")
public class Student implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Embedded
	private Name name;
	
	private int age;
	
	private String gender;
	
	private String college;
	
	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}

	public Student() {
		super();
		this.name = new Name("Not", "given");
		this.age = -1;
		this.gender = "Not given";
		this.college = "Not given";
	}

	public Student(Name name, int age, String gender, String college) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.college = college;
	}

	public Student(int studentId, Name name, int age, String gender, String college) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.college = college;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return String.format("Student [studentId=%s, name=%s, age=%s, gender=%s, college=%s]", studentId, name, age,
				gender, college);
	}
	
}
