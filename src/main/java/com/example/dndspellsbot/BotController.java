package com.example.dndspellsbot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class BotController extends TelegramLongPollingBot {


    @Override
    public void onUpdateReceived(Update update) {






    }

    @Override
    public String getBotUsername() {
        return "dndspellsbot";
    }

    @Override
    public String getBotToken() {
        return "1098327562:AAHubJon7HSVOUX0x5vvRqCWpycW614aQPA";
    }
}
