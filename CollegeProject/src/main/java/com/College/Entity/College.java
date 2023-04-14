package com.College.Entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class College {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "College_name")
	private String CollegeName;
	@Column(name = "Course_name")
	private String CourseName;
	@Column(name = "Course_fee")
	private Double CourseFee;
	@Column(name = "Duration")
	private String Duration;
	@Column(name = "Accommodation\r\n" + "AC/ Non-AC \r\n" + "")
	private String Accommodation;
	@Column(name = "Accommodation_Fee")
	private int AccommodationFee;
	@Column(name = "emp_id")
	private String clg_id;

	public College(String clg_id) {
		super();
		this.clg_id = clg_id;
	}

	public String getclg_id() {
		return clg_id;
	}

	public void setclg_id(String clg_id) {
		this.clg_id = clg_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public Double getCourseFee() {
		return CourseFee;
	}

	public void setCourseFee(Double courseFee) {
		CourseFee = courseFee;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public String getAccommodation() {
		return Accommodation;
	}

	public void setAccommodation(String accommodation) {
		Accommodation = accommodation;
	}

	public int getAccommodationFee() {
		return AccommodationFee;
	}

	public void setAccommodationFee(int accommodationFee) {
		AccommodationFee = accommodationFee;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", CollegeName=" + CollegeName + ", CourseName=" + CourseName + ", CourseFee="
				+ CourseFee + ", Duration=" + Duration + ", Accommodation=" + Accommodation + ", AccommodationFee="
				+ AccommodationFee + "]";
	}

	public College(int id, String collegeName, String courseName, Double courseFee, String duration,
			String accommodation, int accommodationFee) {
		super();
		this.id = id;
		CollegeName = collegeName;
		CourseName = courseName;
		CourseFee = courseFee;
		Duration = duration;
		Accommodation = accommodation;
		AccommodationFee = accommodationFee;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
}