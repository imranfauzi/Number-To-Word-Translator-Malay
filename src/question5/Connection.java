package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Connection {
	
public String client() throws IOException {
		
		
		String hostname = "172.16.22.1";
		int port = Integer.parseInt("31337");
		String input = "";
		try {
//			ServerSocket serverSocket = new ServerSocket(31337);
//			Socket socket = serverSocket.accept();
			Socket socket = new Socket(hostname, port);
			BufferedReader in = new BufferedReader (new InputStreamReader (socket.getInputStream ()));
			input = in.readLine();
			return input;
			
		} catch(Exception e) {
			return "";
		}
		
	}

}
