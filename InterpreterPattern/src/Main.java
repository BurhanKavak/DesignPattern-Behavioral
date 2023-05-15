public class Main {

    // Yenes ve Raşit erkek
    public static Expression getMaleExpression() {
        Expression yenes = new TerminalExpression("Yenes");
        Expression rasit = new TerminalExpression("Rasit");
        return new OrExpression(yenes,rasit);
    }

    public static Expression getMarriedWomanExpression() {
        Expression ayse = new TerminalExpression("Ayse");
        Expression evli = new TerminalExpression("Evli");
        return new OrExpression(ayse,evli);
    }
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Yenes Erkek mi? " + isMale.interpret("Yenes"));
        System.out.println("Ayse evli mi? " +  isMarriedWoman.interpret("Ayse Evli"));
    }
}