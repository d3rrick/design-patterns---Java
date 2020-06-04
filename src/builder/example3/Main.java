package builder.example3;

public class Main {
    public static void main(String[] args) {
        PhoneBuilder builder = new PhoneBuilder();
        PhoneEngineer engineer = new PhoneEngineer(builder);
        engineer.makePhone();
        Phone phoneA = engineer.getPhone();
        System.out.println(phoneA);
    }
}
