package br.com.leonardojgs.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "br.com.leonardojgs.*")
public class CoreConfiguration {
	
	public CoreConfiguration() {
		System.out.println("CORE CONFIG - OK");
	}

}
