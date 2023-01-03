
import java.net.Proxy;
import java.net.Socket;
import java.nio.channels.Channel;
import java.nio.channels.SocketChannel;

public class Main {
    public static void main(String[] args) {
        run();
    }


    public static void run(){
        // Create options for a WiFi connection with SSID = "mynet" and password "abc"


        try{
            Socket socket = new Socket();
            SocketChannel channel = socket.getChannel();
            if (channel.isOpen()){
                System.out.println("is connected");
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }




    }
}