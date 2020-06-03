package builderpatters.example3;

public class PhoneEngineer {
    public PhoneBuilder phoneBuilder;

    public PhoneEngineer(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public void makePhone(){
        this.phoneBuilder.buildBattery();
        this.phoneBuilder.buildOs();
        this.phoneBuilder.buildProcessor();
        this.phoneBuilder.buildRam();
        this.phoneBuilder.buildScreenSize();

    }

    public Phone getPhone(){
        return  this.phoneBuilder.getPhone();
    }
}
