package org.safinajaal.currency;

import org.safinajaal.currency.config.CurrencyClientCfg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CurrencyClientCfg.class)
public class CurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyApplication.class, args);
	}

}
