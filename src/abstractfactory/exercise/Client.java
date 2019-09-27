package abstractfactory.exercise;

public class Client {

    public static void main(String[] args) {
        AbstractFactory originFactory = FactoryProducer.getFactory("origin");
        AbstractFactory genreFactory = FactoryProducer.getFactory("genre");

        Movie movie = new Movie();
        movie.setGenre(genreFactory.getGenre("comedy"));
        movie.setOrigin(originFactory.getOrigin("hollywood"));

        System.out.println("This is a " + movie.getOrigin().getName() + " " + movie.getGenre().getName() + " movie.");
    }
}
