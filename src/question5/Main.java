package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connect = new Connection();
		Translation translate = new Translation();
		
		try {
			translate.translate_to_words(connect.client().toCharArray());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
