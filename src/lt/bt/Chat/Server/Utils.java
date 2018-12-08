package lt.bt.Chat.Server;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Utils {
	private static final int CONNECTION_PORT = 10002;
	private static final String CONNECTION_IP = "8.8.8.8";
	public static String getServerIp() {
		String ip = "";
		try (final DatagramSocket socket = new DatagramSocket()) {
			socket.connect(InetAddress.getByName(CONNECTION_IP), CONNECTION_PORT);
			ip = socket.getLocalAddress().getHostAddress();
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();
		}
		return ip;
	}
}
