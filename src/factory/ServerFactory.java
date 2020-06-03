package factory;


import factory.servers.FtpServer;
import factory.servers.MailServer;
import factory.servers.QuantumServer;

//creating server objects
//dynamically generate a server
public class ServerFactory {

    //return type is an interface
    // complexity of serverType in return is removed by an interface
    public static ServerInterface getServer(String serverType){
        switch(serverType.toLowerCase()){
            case "mail":
                return new MailServer();
            case "ftp":
                return  new FtpServer();
            case "quantum":
                return  new QuantumServer();
            default:
                throw new IllegalStateException("server type supported");
        }


    }
}
