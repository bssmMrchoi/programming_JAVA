package ch16.generic1;

public class ThreeDPrinterObject {
    private Object material;

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreeDPrinterPlastic{" +
                "material=" + material +
                '}';
    }
}
