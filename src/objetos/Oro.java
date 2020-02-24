package objetos;

public class Oro {

    private double base, total, sell;
    private boolean purchasable;

    public Oro(double base, double total, double sell, boolean purchasable) {
        super();
        this.base = base;
        this.total = total;
        this.sell = sell;
        this.purchasable = purchasable;
    }

    public double getBase() {
        return base;
    }

    public double getTotal() {
        return total;
    }

    public double getSell() {
        return sell;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public void setPurchasable(boolean purchasable) {
        this.purchasable = purchasable;
    }
}
