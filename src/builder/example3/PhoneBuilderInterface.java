package builder.example3;

public interface PhoneBuilderInterface {
    public void buildOs();

    public void buildRam();

    public void buildProcessor();

    public void buildScreenSize();

    public void buildBattery();

    public Phone getPhone();
}