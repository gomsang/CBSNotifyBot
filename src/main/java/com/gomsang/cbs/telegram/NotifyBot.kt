package com.gomsang.cbs.telegram

import com.gomsang.cbs.constants.SensitiveKey
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

class NotifyBot : TelegramLongPollingBot() {
    override fun onUpdateReceived(update: Update) {
        update.message?.let{ message->
            println(message)
        }
    }

    override fun getBotUsername(): String {
        return "cbsnotifybot"
    }

    override fun getBotToken(): String {
        return SensitiveKey.KEY_BOT_TELEGRAM
    }
}