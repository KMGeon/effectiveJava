package com.example.effectivejava.item1;

public class Main {
	public static void main(String[] args) {
		HelloService ko = HelloServiceFactory.of("ko");
		System.out.println(ko.hello());

		String eng = HelloService.of("eng").hello();
		System.out.println(eng);
	}
}
