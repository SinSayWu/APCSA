public class Smartphone {
    private String brand;
    private String model;
    private int storageGB;
    private int photoSize = 1;
    private static int numSold;

    // Constructors
    public Smartphone(String brand1, String model1) {
        brand = brand1;
        model = model1;
        storageGB = 128;
        numSold++;
    }

    public Smartphone(String brand1, String model1, int storageGB1) {
        brand = brand1;
        model = model1;
        storageGB = storageGB1;
        numSold++;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storageGB;
    }

    public int getNumSold() {
        return numSold;
    }

    // Setters
    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setStorage(int newStorage) {
        storageGB = newStorage;
    }

    // Instance Methods
    public String specs() {
        return "Brand: " + brand + "\nModel: " + model + "\nStorage: " + storageGB + " GB";
    }

    public static int numberSold() {
        return numSold;
    }

    public int takePhoto() {
        storageGB -= photoSize;
        return storageGB;
    }

    public int installApp(int appSize) {
        storageGB -= appSize;
        return storageGB;
    }
}
