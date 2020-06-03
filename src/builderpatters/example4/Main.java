package builderpatters.example4;

public class Main {
    public static void main(String[] args) {
        ContactBuilder builder = new ContactBuilder();
        Contact contact = builder
                .setFirstName("derrick")
                .setLastName("test")
                .build();
        System.out.println(contact);
    }
}
