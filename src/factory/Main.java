package factory;

public class Main {
    public static void main(String[] args) {

        //resolving a type of server
        // ftp, mail, app etc...

        ServerInterface mailServer = ServerFactory.getServer("MAIl");
        mailServer.resolve();

        ServerInterface ftpServer = ServerFactory.getServer("ftp");
        ftpServer.resolve();

        ServerInterface nonExistent = ServerFactory.getServer("bad");
        nonExistent.resolve();

    }
}
