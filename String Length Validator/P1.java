import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class P1
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket DSocket = new DatagramSocket();

        Scanner s = new Scanner(System.in);

        InetAddress ip = InetAddress.getLocalHost();

        System.out.print("Enter String: ");
        String str = s.nextLine();

        byte []sendMessage = str.getBytes();;

        DatagramPacket packetSend = new DatagramPacket(sendMessage,sendMessage.length,ip,44000);

        DSocket.send(packetSend);
    }
}