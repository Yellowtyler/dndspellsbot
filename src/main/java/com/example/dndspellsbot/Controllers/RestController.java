package com.example.dndspellsbot.Controllers;

import com.example.dndspellsbot.Model.Spell;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@org.springframework.web.bind.annotation.RestController
public class RestController {


public Spell getSpell(String spellname)
{


    if(spellname.contains(" ")) {

        String[] words = spellname.split(" ");
        spellname="";
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1)
                spellname += words[i]+ "-";
            else
                spellname += words[i];
        }
    }
    spellname=spellname.toLowerCase();

    RestTemplate restTemplate = new RestTemplate();
    Spell spell=new Spell();
    try {
         spell = restTemplate.getForObject("http://www.dnd5eapi.co/api/spells/" + spellname, Spell.class);
    }
    catch (Exception ex)
    {
        return null;

    }


    return spell;
}

}
