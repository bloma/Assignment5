package za.ac.cput.aphiwe.domain;

/**
 * Created by Aphish on 2016/04/02.
 */
public abstract class Genre {
    Genre nextGenre;
    String genreName;

    public Genre(){}

    public Genre(Genre nextGenre, String genreName) {
        this.nextGenre = nextGenre;
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }



    public void setNextGenre(Genre nextGenre){
        this.nextGenre = nextGenre;
    }

    public abstract String handleMovieRequest(String name);

    private Genre(Builder builder){
        this.nextGenre =builder.nextGenre;
        this.genreName =builder.genreName;
    }

    public static class Builder{
        Genre nextGenre;
        String genreName;
        public Builder nextGenre(Genre value){
            this.nextGenre=value;
            return this;
        }
        public Builder genreName(String value){
            this.genreName = value;
            return this;
        }

        public Builder copy(Genre value){
            this.nextGenre = value.nextGenre;
            this.genreName = value.genreName;
            return this;
        }
        public Genre build(){
            return new Genre(this) {
                public String handleMovieRequest(String name) {
                    return null;
                }
            };
            }
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre = (Genre) o;

        return nextGenre.equals(genre.nextGenre);

    }

    @Override
    public int hashCode() {
        return nextGenre.hashCode();
    }
}

