package abstractfactory.exercise;

public class OriginFactory extends AbstractFactory {
    @Override
    public Origin getOrigin(String origin) {
        switch (origin) {
            case "bollywood" : return new Bollywood();
            case "hollywood" : return new Hollywood();
            default: return null;

        }
    }

    @Override
    public Genre getGenre(String genre) {
        return null;
    }
}
