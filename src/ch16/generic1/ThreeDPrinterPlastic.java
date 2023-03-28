package ch16.generic1;

public class ThreeDPrinterPlastic {
    private Plastic material;

    public Plastic getMaterial() {
        return material;
    }

    public void setMaterial(Plastic material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreeDPrinterPlastic{" +
                "material=" + material +
                '}';
    }
}
