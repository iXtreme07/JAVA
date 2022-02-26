public class Camera {
    private String brand;
    private double megaPixels;
    private double displaySize;
    private Boolean colored;
    private Lens lens;

    public Camera(String brand, double megaPixels, double displaySize, Boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        Main.cameraCrowd++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public Boolean getColored() {
        return colored;
    }

    public void setColored(Boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                '}';
    }
}
