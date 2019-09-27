package abstractfactory.exercise;

public class Movie {
    private Origin origin;
    private Genre genre;

    public Movie() {
    }

    public Movie(Origin origin, Genre genre) {
        this.origin = origin;
        this.genre = genre;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "origin=" + origin +
                ", genre=" + genre +
                '}';
    }
}
