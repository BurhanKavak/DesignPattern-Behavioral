public interface Subject {

    //TODO Gözlemci kaydetme ve kaldırma methodları
    public void register(Observer obj);
    public void unregister(Observer obj);

    //TODO Gözlemcileri değişiklikten haberdar etme
    public void notifyObservers();

    //TODO Güncellemeri almak için
    public Object getUpdate(Observer obj);
}
