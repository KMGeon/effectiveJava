package com.example.effectivejava.item1;

public interface HelloService {
	String hello();

	static HelloService of(String lang){
		return lang.equals("ko")?new KoreanHelloService() : new EnglishHelloService();
	}
}
