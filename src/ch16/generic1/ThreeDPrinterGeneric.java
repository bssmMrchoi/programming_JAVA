package ch16.generic1;

public class ThreeDPrinterGeneric<T> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreeDPrinterGeneric{" +
                "material=" + material +
                '}';
    }
}
