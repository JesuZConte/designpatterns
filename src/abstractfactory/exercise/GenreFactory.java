package abstractfactory.exercise;

public class GenreFactory extends AbstractFactory {
    @Override
    public Genre getGenre(String genre) {
        switch (genre) {
            case "comedy" : return new Comedy();
            case "action" : return new Action();
            default: return null;

        }

    }

    @Override
    public Origin getOrigin(String origin) {
        return null;
    }

}
