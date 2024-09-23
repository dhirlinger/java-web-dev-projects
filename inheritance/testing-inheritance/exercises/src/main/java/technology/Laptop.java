package technology;

public class Laptop extends Computer{
    private int screenWidth;

    protected String printScreenWidth(){
        return "Screen Width: " + getScreenWidth();
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }
}
