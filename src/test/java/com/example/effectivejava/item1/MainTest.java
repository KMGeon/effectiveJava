package com.example.effectivejava.item1;

import java.util.Optional;
import java.util.ServiceLoader;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void serviceLoader() throws Exception{
		//given

		//when
		ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
		System.out.println(" = ===================");
		Optional<HelloService> helloServiceOptional = load.findFirst();
		helloServiceOptional.ifPresent(helloService -> {
			System.out.println(helloService.hello());
		});



		//then

	}

	@Test
	public void fdsjkl() throws Exception{
		//given
		String ko = HelloService.of("ko").hello();
		System.out.println("ko = " + ko);
		//when

		//then

	}
}