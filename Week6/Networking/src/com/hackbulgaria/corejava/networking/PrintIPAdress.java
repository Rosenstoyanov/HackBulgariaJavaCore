package com.hackbulgaria.corejava.networking;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class PrintIPAdress {

	public static String displayInterfaceInformation(NetworkInterface netint) {
		Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
		for (InetAddress inetAddress : Collections.list(inetAddresses)) {
			if (inetAddress instanceof Inet4Address) {
				return inetAddress.getHostAddress();
			}

		}
		return null;
	}

	public static void main(String args[]) throws SocketException {
		ArrayList<NetworkInterface> nets3 = new ArrayList<>(
				Collections.list(NetworkInterface.getNetworkInterfaces()));
		System.out.println(displayInterfaceInformation(nets3.get(0)));
	}

}
