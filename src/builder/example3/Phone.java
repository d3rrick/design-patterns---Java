package builder.example3;

public class Phone implements PhonePlan{
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }

    @Override
    public void setOs(String os) {
        this.os =os;
    }

    @Override
    public void setRam(int ram) {
        this.ram=ram;

    }

    @Override
    public void setProcessor(String processor) {
        this.processor=processor;

    }

    @Override
    public void setScreenSize(double screenSize) {
        this.screenSize=screenSize;

    }

    @Override
    public void setBattery(int battery) {
        this.battery=battery;

    }
}


