package factory.servers;

import factory.ServerInterface;

public class FtpServer implements ServerInterface {
    @Override
    public void resolve() {
        System.out.println("performing ftp server resolution");
    }
}
