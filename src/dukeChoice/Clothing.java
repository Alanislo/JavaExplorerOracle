package dukeChoice;

public class Clothing {
   private String description;
   private double price;
   private String size = "M";

   public final static double  MIN_PRICE = 10.0; // static, pertenece a la clase en lugar de la instancia
   public final static double TAX_RATE = .2;

    public Clothing(String description, double price, String aSize ) {
        this.description = description;
        this.price = price;
        size = aSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
