package com.gomsang.cbs

import com.gomsang.cbs.telegram.NotifyBot
import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.exceptions.TelegramApiException


class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            ApiContextInitializer.init()

            val botsApi = TelegramBotsApi()

            try {
                botsApi.registerBot(NotifyBot())
            } catch (e: TelegramApiException) {
                e.printStackTrace()
            }

            while (true);
        }
    }
}