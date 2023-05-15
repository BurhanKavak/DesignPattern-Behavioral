public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stok [ Isim " + name + ","
        + "Fiyat: " +quantity + " ] satin alindi.");
    }


    public void sell() {
        System.out.println("Stok [ Isim " + name + ","
                + "Fiyat: " +quantity + " ] satildi.");
    }
}
