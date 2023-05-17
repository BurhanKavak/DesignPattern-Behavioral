public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Oyuncu durdurma durumundadir");
    }


    @Override
    public String toString() {
        return "Durdurma durumu";
    }
}
