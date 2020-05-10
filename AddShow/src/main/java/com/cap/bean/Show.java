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
@Table(name="showtab")
public class Show {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "show_sequence")
	@SequenceGenerator(name="show_sequence", sequenceName = "show_seq",allocationSize = 1)
	@Column(length = 5)
	private int show_Id;
	@Column(length = 4)
	private int screen_Id;
	@Column(length = 15)
	private String show_Start_Time;
	@Column(length = 15)
	private String show_End_Time;
	@Column(length = 15)
	private String show_Name;
	@Column(length = 3)
	private int r_movie_id;
	@ManyToOne(optional = false)
    @JoinColumn(name="MOVIE_ID")
	private Movie movie;
	
	public int getShow_Id() {
		return show_Id;
	}
	
	
	public void setShow_Id(int show_Id) {
		this.show_Id = show_Id;
	}


	public int getScreen_Id() {
		return screen_Id;
	}


	public void setScreen_Id(int screen_Id) {
		this.screen_Id = screen_Id;
	}


	public String getShow_Start_Time() {
		return show_Start_Time;
	}


	public void setShow_Start_Time(String show_Start_Time) {
		this.show_Start_Time = show_Start_Time;
	}


	public String getShow_End_Time() {
		return show_End_Time;
	}


	public void setShow_End_Time(String show_End_Time) {
		this.show_End_Time = show_End_Time;
	}


	public String getShow_Name() {
		return show_Name;
	}


	public void setShow_Name(String show_Name) {
		this.show_Name = show_Name;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getR_movie_id() {
		return r_movie_id;
	}


	public void setR_movie_id(int r_movie_id) {
		this.r_movie_id = r_movie_id;
	}

	@Override
	public String toString() {
		return "Show [show_Id=" + show_Id + ", screen_Id=" + screen_Id + ", show_Start_Time=" + show_Start_Time
				+ ", show_End_Time=" + show_End_Time + ", show_Name=" + show_Name + ", r_movie_id=" + r_movie_id
				+ ", movie=" + movie + "]";
	}
}