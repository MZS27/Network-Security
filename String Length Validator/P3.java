import java.io.IOException;
import java.net.*;


public class P3
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket DSocket = new DatagramSocket(44005);
        byte []recieveMessage = new byte[200];

        DatagramPacket packetRecieve = new DatagramPacket(recieveMessage, recieveMessage.length);

        DSocket.receive(packetRecieve);

        String message = (new String(recieveMessage)).trim();

        System.out.println("Message recieved: " + message);
    }
}