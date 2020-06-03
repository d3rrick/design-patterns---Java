package factory;

public class Main {
    public static void main(String[] args) {

        //resolving a type of server
        // ftp, mail, app etc...

        ServerInterface server = ServerFactory.getServer("MAIl");
        server.resolve();

    }
}
