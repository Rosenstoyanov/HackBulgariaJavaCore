package com.hackbulgaria.corejava.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class echoServer {
	public void openServer(String... args) throws UnknownHostException,
			IOException {
		String hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);

		Socket echoSocket = new Socket(hostName, portNumber);
		try {
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),
					true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					echoSocket.getInputStream()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(
				System.in));
	}

	// public void IDK() {
	//
	// String userInput;
	// while ((userInput = stdIn.readLine()) != null) {
	// System.out.println(userInput);
	// System.out.println("echo: " + in.readLine());
	// }
	//
	// }
}
