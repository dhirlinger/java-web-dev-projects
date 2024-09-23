package technology;

public class SmartPhone extends Computer{
    private String name;
    private String serviceProvider;

    public SmartPhone(String name, String manufactorer, String os, int ram){
        super(manufactorer,os, ram);
        this.name = name;
    }

    protected String printName(){
        return getName() + "'s Phone";
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
