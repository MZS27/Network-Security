import java.io.IOException;
import java.net.*;


public class P2
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket DSocket = new DatagramSocket(44000);
        byte []recieveMessage = new byte[200];

        DatagramPacket packetRecieve = new DatagramPacket(recieveMessage, recieveMessage.length);

        DSocket.receive(packetRecieve);

        String trimStr = (new String(recieveMessage)).trim();

        int stringLen = trimStr.length();



        if(stringLen<100)
        {
            DatagramSocket DSocket2 = new DatagramSocket();

            InetAddress ip = InetAddress.getLocalHost();

            byte[] resultBytes = String.valueOf(stringLen).getBytes();

            DatagramPacket packetSend = new DatagramPacket(resultBytes, resultBytes.length, ip, 44005);

            DSocket2.send(packetSend);
        }
        else
        {
            System.out.print("Cannot forward message. Message too long");
            System.out.print("\nMessage length: " + stringLen);
        }


    }
}