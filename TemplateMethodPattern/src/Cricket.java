public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket oyunu basladi");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket oyunu oynaniyor");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket oyunu bitti");
    }
}
