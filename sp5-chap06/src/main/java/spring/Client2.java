package spring;

import org.springframework.context.annotation.Bean;

public class Client2 {
	
	private String host;
	
	@Bean(initMethod="connect",destroyMethod="close")
	public Client2 client2() {
		Client2 client = new Client2();
		client.setHost("host");
		return client;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public void connect() {
		System.out.println("Client2.connect() 실행");
	}
	
	public void send() {
		System.out.println("Client2.send() to "+host);
	}
	
	public void close() {
		System.out.println("Client2.close() 실행");
	}
}
