package Lab_Assignment2.Encapsulation;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            this.storageCapacity += additionalStorage;
        }
    }
}
class Main3 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.setBrand("SmartMobile");
        phone.setModel("W1000");
        phone.setStorageCapacity(60);

        phone.increaseStorage(30);

        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage Capacity: " + phone.getStorageCapacity() + "GB");
    }
}
