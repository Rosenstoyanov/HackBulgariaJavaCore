package com.hackbulgaria.corejava.networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintAllIpAddresses {
	@SuppressWarnings("unchecked")
	public static void getAllIps() throws UnknownHostException, IOException {
		// ArrayList<NetworkInterface> nets3 = new ArrayList<>(
		// Collections.list(NetworkInterface.getNetworkInterfaces()));
		// String iP = PrintIPAdress.displayInterfaceInformation(nets3.get(0));
		// ArrayList<NetworkInterface> nets4 = new ArrayList<>();
		InetAddress adress = null;

		String str = "192.168.1.";
		for (int i = 1; i < 255; i++) {
			// nets4.add(Inet4Address.getByName("192.168.1.1").isReachable(60));
			adress = InetAddress.getByName(str + i);
			if (adress.isReachable(60)) {
				System.out.println(adress);
			}
		}
		// for (int i = 0; i < nets4.size(); i++) {
		// System.out.println(PrintIPAdress.displayInterfaceInformation(nets4
		// .get(i)));
		// }
		// for (int i = 0; i < nets4.size(); i++) {
		// System.out.println("-----------------------------");
		// System.out.println(nets4.get(i));
		// }
	}

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		PrintAllIpAddresses.getAllIps();
	}
}
