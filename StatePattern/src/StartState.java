public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Oyuncu baslangic durumundadir");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Baslama durumu";
    }
}
