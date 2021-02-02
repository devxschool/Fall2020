package oop.apple;

public class IosApp {
    private String name;
    private String version;
    private double memorySize;
    private double price;
    private boolean isOpen;

    public IosApp(String name, String version, double memorySize, double price) {
        this.name = name;
        this.version = version;
        this.memorySize = memorySize;
        this.price = price;
        this.isOpen = false;
    }

    /**
     * we want to be able to open applications that we have Iphone.
     */
    public void open() {
        System.out.println("Opened " + name + " application");
        isOpen = true;
    }

    public void close(){
        System.out.println("Closed " + name + " application");
        isOpen = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Use it to check if the app is open or not.
     * @return
     */
    public boolean isOpen() {
        return isOpen;
    }


}
