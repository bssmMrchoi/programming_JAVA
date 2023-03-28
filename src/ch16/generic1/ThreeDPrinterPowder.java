package ch16.generic1;

public class ThreeDPrinterPowder {
    private Powder material;

    public Powder getMaterial() {
        return material;
    }

    public void setMaterial(Powder material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreeDPrinterPlastic{" +
                "material=" + material +
                '}';
    }
}
