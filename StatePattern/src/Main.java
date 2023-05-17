public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState starState = new StartState();
        starState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}