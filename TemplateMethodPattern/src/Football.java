public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Futbol oyunu basladi");
    }

    @Override
    void startPlay() {
        System.out.println("Futbol oyunu oynaniyor");
    }

    @Override
    void endPlay() {
        System.out.println("Futbol oyunu bitti");
    }
}
