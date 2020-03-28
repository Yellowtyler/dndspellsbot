package com.example.dndspellsbot;

import com.example.dndspellsbot.Model.Spell;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DndspellsbotApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DndspellsbotApplication.class, args);
	}



	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
        Spell spell = restTemplate.getForObject("http://www.dnd5eapi.co/api/spells/misty-step",Spell.class);
        System.out.println(spell.getClasses()[0].getName());
	}
}
