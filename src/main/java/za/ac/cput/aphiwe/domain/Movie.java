package za.ac.cput.aphiwe.domain;

import za.ac.cput.aphiwe.factories.Genre;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public class Movie {
    private String movieName;
    private Date releaseDate;
    private Time movieDuration;
    private String movieDescription;
    private Genre genre;

    public Movie(String movieName, Date releaseDate, Time movieDuration, String movieDescription,Genre genre) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.movieDuration = movieDuration;
        this.movieDescription = movieDescription;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Time getMovieDuration() {
        return movieDuration;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", releaseDate=" + releaseDate +
                ", movieDuration=" + movieDuration +
                ", movieDescription='" + movieDescription + '\'' +
                ", genre=" + genre +
                '}';
    }
}
