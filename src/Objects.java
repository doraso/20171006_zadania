public class Objects {

    private String chocoladeBrnd;
    private String chocoladeKind;
    private double price;

    public Objects(String chocoladeBrnd, String chocoladeKind, double price) {
        this.chocoladeBrnd = chocoladeBrnd;
        this.chocoladeKind = chocoladeKind;
        this.price = price;
    }

    public Objects() {
    }

    public String getChocoladeBrnd() {
        return chocoladeBrnd;
    }

    public void setChocoladeBrnd(String chocoladeBrnd) {
        this.chocoladeBrnd = chocoladeBrnd;
    }

    public String getChocoladeKind() {
        return chocoladeKind;
    }

    public void setChocoladeKind(String chocoladeKind) {
        this.chocoladeKind = chocoladeKind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marka: " + chocoladeBrnd + ", rodzaj: " + chocoladeKind + ", cena: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objects objects = (Objects) o;

        if (Double.compare(objects.price, price) != 0) return false;
        if (!chocoladeBrnd.equals(objects.chocoladeBrnd)) return false;
        return chocoladeKind.equals(objects.chocoladeKind);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = chocoladeBrnd.hashCode();
        result = 31 * result + chocoladeKind.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
