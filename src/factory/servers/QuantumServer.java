package factory.servers;

import factory.ServerInterface;

public class QuantumServer implements ServerInterface {
    @Override
    public void resolve() {
        System.out.println("performing resolution on quantum server");
    }
}
