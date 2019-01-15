package com.hrms.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="holidat_tbl")
public class Holiday {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long holiday_id;

	private String title;
	private String holidayDate;
//	private String Day;

	public Long getHoliday_id() {
		return holiday_id;
	}

	public void setHoliday_id(Long holiday_id) {
		this.holiday_id = holiday_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(String holidayDate) {
		this.holidayDate = holidayDate;
	}

//	public String getDay() {
//		return Day;
//	}

//	public void setDay(String day) {
//		Day = day;
//	}

	public Holiday(Long holiday_id, String title, String holidayDate, String day) {
		super();
		this.holiday_id = holiday_id;
		this.title = title;
		this.holidayDate = holidayDate;
		//Day = day;
	}

	public Holiday() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Holiday [holiday_id=" + holiday_id + ", title=" + title + ", holidayDate=" + holidayDate + ", Day="
				+"]";
	}

}
