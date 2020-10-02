package com.structural.proxy.internet;

public interface Internet {
	void grantInternetAccess();
	void connectTo(String serverhost) throws Exception;
}
