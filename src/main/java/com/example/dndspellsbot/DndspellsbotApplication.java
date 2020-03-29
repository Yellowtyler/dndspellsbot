package com.example.dndspellsbot;

import com.example.dndspellsbot.Model.Spell;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class DndspellsbotApplication  {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(DndspellsbotApplication.class, args);
	}

}
