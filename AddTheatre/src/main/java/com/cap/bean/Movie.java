package com.cap.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="movietab")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_sequence")
	@SequenceGenerator(name="add_sequence", sequenceName = "add_seq",allocationSize = 1)
	@Column(length = 3)
	private int movie_Id;
	@Column(length = 20)
	private String movie_Name;
	@Column(length = 10)
	private String movie_Genre;
	@Column(length = 20)
	private String movie_Director;
	@Column(length = 15)
	private String movie_Length;
	@Column(length = 15)
	private String languages;
	@Column(length = 15)
    private String movie_Release_Date;
	
	public int getMovie_Id() {
		return movie_Id;
	}
	public void setMovie_Id(int movie_Id) {
		this.movie_Id = movie_Id;
	}
	public String getMovie_Name() {
		return movie_Name;
	}
	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}
	public String getMovie_Genre() {
		return movie_Genre;
	}
	public void setMovie_Genre(String movie_Genre) {
		this.movie_Genre = movie_Genre;
	}
	public String getMovie_Director() {
		return movie_Director;
	}
	public void setMovie_Director(String movie_Director) {
		this.movie_Director = movie_Director;
	}
	public String getMovie_Length() {
		return movie_Length;
	}
	public void setMovie_Length(String movie_Length) {
		this.movie_Length = movie_Length;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getMovie_Release_Date() {
		return movie_Release_Date;
	}
	public void setMovie_Release_Date(String movie_Release_Date) {
		this.movie_Release_Date = movie_Release_Date;
	}
	
}