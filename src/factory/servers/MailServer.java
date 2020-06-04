package factory.servers;

import factory.ServerInterface;

public class MailServer implements ServerInterface {

    @Override
    public void resolve() {
        System.out.println("performing resolution on mail server");


    }
}
