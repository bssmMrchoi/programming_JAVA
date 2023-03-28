package ch16.generic1;

public class ThreeDPrinterExam {
    public static void main(String[] args) {
        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        ThreeDPrinterPowder printerPowder = new ThreeDPrinterPowder();
        printerPowder.setMaterial(powder);
        //printerPowder.setMaterial(plastic);
        System.out.println(printerPowder.getMaterial());

        System.out.println("========================");
        ThreeDPrinterObject printerObject = new ThreeDPrinterObject();
        printerObject.setMaterial(powder);
        System.out.println(printerObject.getMaterial());
        printerObject.setMaterial(plastic);
        System.out.println(printerObject.getMaterial());
        Plastic pl = (Plastic) printerObject.getMaterial();
        System.out.println(printerObject);

        System.out.println("========================");
        ThreeDPrinterGeneric<Powder> powderThreeDPrinterGeneric = new ThreeDPrinterGeneric<>();
        ThreeDPrinterGeneric<Plastic> plasticThreeDPrinterGeneric = new ThreeDPrinterGeneric<>();
        powderThreeDPrinterGeneric.setMaterial(powder);
        System.out.println(powderThreeDPrinterGeneric.getMaterial());
        //powderThreeDPrinterGeneric.setMaterial(plastic);
        plasticThreeDPrinterGeneric.setMaterial(plastic);
        System.out.println(powderThreeDPrinterGeneric);
        System.out.println(plasticThreeDPrinterGeneric);
    }
}
