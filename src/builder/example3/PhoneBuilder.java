package builder.example3;

public class PhoneBuilder implements PhoneBuilderInterface{
    public Phone phone;


    public PhoneBuilder() {
        this.phone = new Phone();
    }

    @Override
    public void buildOs() {
        this.phone.setOs("Android");
    }

    @Override
    public void buildRam() {
        this.phone.setRam(8);

    }

    @Override
    public void buildProcessor() {
        this.phone.setProcessor("127");

    }

    @Override
    public void buildScreenSize() {
        this.phone.setScreenSize(5.5);
    }

    @Override
    public void buildBattery() {
        this.phone.setBattery(4300);

    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }
}
