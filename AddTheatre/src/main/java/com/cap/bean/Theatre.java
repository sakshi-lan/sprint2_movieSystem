package com.cap.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="theatretab")
public class Theatre {
	
	@Id
	@SequenceGenerator(name="seq2", initialValue=2000, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq2")
	@Column(length = 3)
	private int theatre_Id;
	@Column(length = 20)
	private String theatre_Name;
	@Column(length = 20)
	private String theatre_City;
	@Column(length = 3)
	private int r_movie_id;
	@ManyToOne(optional = false)
    @JoinColumn(name="MOVIE_ID")
	private Movie movie;
	@Column(length = 20)
	private String manager_Name;
	@Column(length = 10)
	private String manager_Contact;
	
	
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


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
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
		return "Theatre [theatre_Id=" + theatre_Id + ", theatre_Name=" + theatre_Name + ", theatre_City=" + theatre_City
				+ ", r_movie_id=" + r_movie_id + ", movie=" + movie + ", manager_Name=" + manager_Name
				+ ", manager_Contact=" + manager_Contact + "]";
	}
	
}