package builderpatters.example3;

import builderpatters.example1.Robot;

public interface PhoneBuilderInterface {
    public void buildOs();

    public void buildRam();

    public void buildProcessor();

    public void buildScreenSize();

    public void buildBattery();

    public Phone getPhone();
}