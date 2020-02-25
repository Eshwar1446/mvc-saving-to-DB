package com.org.xworkz.dto;

import java.io.Serializable;



import org.springframework.stereotype.Component;


@Component

public class MovieDTO implements Serializable {

	private String movieName;
	private String directorName;
	private String year;

	public MovieDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", directorName=" + directorName + ", year=" + year + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
