package com.cap.model;

public class TheatreInfo {
	
	private int theatre_Id;
	private String theatre_Name;
	private String theatre_City;
	private Integer movie_Id;
	private String manager_Name;
	private String manager_Contact;
	private int r_movie_id;
	
	public int getTheatre_Id() {
		return theatre_Id;
	}


	public void setTheatre_Id(int theatre_Id) {
		this.theatre_Id = theatre_Id;
	}


	public String getTheatre_Name() {
		return theatre_Name;
	}


	public void setTheatre_Name(String theatre_Name) {
		this.theatre_Name = theatre_Name;
	}


	public String getTheatre_City() {
		return theatre_City;
	}


	public void setTheatre_City(String theatre_City) {
		this.theatre_City = theatre_City;
	}


	public Integer getMovie_Id() {
		return movie_Id;
	}


	public void setMovie_Id(Integer movie_Id) {
		this.movie_Id = movie_Id;
	}


	public String getManager_Name() {
		return manager_Name;
	}


	public void setManager_Name(String manager_Name) {
		this.manager_Name = manager_Name;
	}


	public String getManager_Contact() {
		return manager_Contact;
	}


	public void setManager_Contact(String manager_Contact) {
		this.manager_Contact = manager_Contact;
	}


	public int getR_movie_id() {
		return r_movie_id;
	}


	public void setR_movie_id(int r_movie_id) {
		this.r_movie_id = r_movie_id;
	}

	@Override
	public String toString() {
		return "TheatreInfo [theatre_Id=" + theatre_Id + ", theatre_Name=" + theatre_Name + ", theatre_City="
				+ theatre_City + ", movie_Id=" + movie_Id + ", manager_Name=" + manager_Name + ", manager_Contact="
				+ manager_Contact + ", r_movie_id=" + r_movie_id + "]";
	}
}