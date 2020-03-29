package com.example.dndspellsbot.Controllers;

import com.example.dndspellsbot.Model.Spell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class BotController extends TelegramLongPollingBot {


    @Autowired
    RestController restController;

    @Override
    public void onUpdateReceived(Update update) {

       if( update.hasMessage()&&update.getMessage().hasText())
        {

            Spell spell =restController.getSpell(update.getMessage().getText());
            String message="";
            if(spell!=null)
            {  message=spell.getName()+"\n\n"+
                           spell.getLevel().toString()+" level "+spell.getSchool().getName()+"\n"+
                           "Casting time: "+spell.getCasting_time()+"\n"+
                            "Range: "+spell.getRange()+"\n"+
                            "Components: " + Arrays.stream(spell.getComponents()).collect(Collectors.joining(","));

            if(spell.getMaterial()!=null)
            {
                message+=" (" +spell.getMaterial().substring(0,spell.getMaterial().length()-1)+")";
            }

            if(spell.getConcentration())
            {
                message+="\nDuration: Concentration, "+spell.getDuration()+"\n\n"+
                        Arrays.stream(spell.getDesc()).reduce("", String::concat)+"\n";
            }
            else
            {
                message+="\nDuration: "+spell.getDuration()+"\n\n"+
                        Arrays.stream(spell.getDesc()).reduce("", String::concat)+"\n";

            }
            if(spell.getHigher_level()!=null)
            {
                 message+="\nAt Higher Levels: " + Arrays.stream(spell.getHigher_level()).reduce("", String::concat);
            }
            }

            else {

                message="Spell could not be found.";

            }
            sendMessage(update.getMessage().getChatId(),message);
        }





    }




    private void sendMessage(long chatId, String message)
    {
        SendMessage sendMessage = new SendMessage().setChatId(chatId).setText(message);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "dndspells_bot";
    }

    @Override
    public String getBotToken() {
        return "***********************";
    }
}
