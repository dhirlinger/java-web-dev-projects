package technology;

public class Computer extends AbstractEntity{
    private String manufacturer;
    private String os;
    private int ram;

    public Computer(){
        super();
    }

    public Computer(String manufacturer, String os, int ram){
        this.manufacturer = manufacturer;
        this.os = os;
        this.ram = ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //2 instance methods
    public String printOs() {
        return "OS: " + getOs();
    }

    public String printRam(){
        return "RAM: " + getRam();
    }
}
