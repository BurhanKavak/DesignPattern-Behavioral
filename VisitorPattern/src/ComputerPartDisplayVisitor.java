public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Bilgisayar goruntuleniyor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse goruntuleniyor");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Klavye goruntuleniyor");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor goruntuleniyor");
    }
}
