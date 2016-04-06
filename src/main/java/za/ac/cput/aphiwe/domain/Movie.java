package za.ac.cput.aphiwe.domain;

import za.ac.cput.aphiwe.factories.Genre;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public class Movie implements Serializable{
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

    private Movie(){}

    private Movie(Builder builder){
       this.movieName = builder.movieName;
        this.releaseDate = builder.releaseDate;
        this.movieDuration = builder.movieDuration;
        this.movieDescription = builder.movieDescription;
        this.genre = builder.genre;
    }

    public static class Builder{
        private String movieName;
        private Date releaseDate;
        private Time movieDuration;
        private String movieDescription;
        private Genre genre;

        public Builder movieName(String name){
            this.movieName=name;
            return this;
        }

        public Builder realesDate(Date value){
            this.releaseDate = value;
            return this;
        }

        public Builder movieDuration(Time value){
            this.movieDuration = value;
            return this;
        }

        public Builder movieDescription(String value){
            this.movieDescription = value;
            return this;
        }

        public Builder genre(Genre value){
            this.genre = value;
            return this;
        }

        public Builder copy(Movie value){
            this.movieName = value.movieName;
            this.releaseDate = value.releaseDate;
            this.movieDuration = value.movieDuration;
            this.movieDescription = value.movieDescription;
            this.genre = value.genre;
            return this;
        }

        public Movie build(){
            return new Movie(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (!movieName.equals(movie.movieName)) return false;
        if (!releaseDate.equals(movie.releaseDate)) return false;
        if (!movieDuration.equals(movie.movieDuration)) return false;
        if (!movieDescription.equals(movie.movieDescription)) return false;
        return genre.equals(movie.genre);

    }

    @Override
    public int hashCode() {
        int result = movieName.hashCode();
        result = 31 * result + releaseDate.hashCode();
        result = 31 * result + movieDuration.hashCode();
        result = 31 * result + movieDescription.hashCode();
        result = 31 * result + genre.hashCode();
        return result;
    }
}
