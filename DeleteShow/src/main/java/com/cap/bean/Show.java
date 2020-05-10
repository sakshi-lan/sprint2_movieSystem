package com.cap.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="showtab")
public class Show {

	@Id
	private int show_Id;
	private String show_Start_Time;
	private String show_End_Time;
	private int screen_Id;
	private String show_Name;
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


	public Integer getScreen_Id() {
		return screen_Id;
	}

	public void setScreen_Id(Integer screen_Id) {
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

	public void setScreen_Id(int screen_Id) {
		this.screen_Id = screen_Id;
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
}