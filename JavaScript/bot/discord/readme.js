import { Client, GatewayIntentBits } from 'discord.js';
import { config } from 'dotenv';
//Run the config() method from 'dotenv'. This retrieves all the tokens from the .env file.
config()
//Opting into intents related to Guilds & Guild Messages.
const bot = new Client({
    intents: [
        GatewayIntentBits.Guilds,
        GatewayIntentBits.GuildMessages,
        GatewayIntentBits.MessageContent
    ]
})

const TOKEN = process.env.TOKEN_0;
//Bot login method.
bot.login(TOKEN)
console.log('Bot logged in!')
/*
 * Ready event.
 * Each event has 2 paramters:
 * 1. Name of the event.
 * 2. Event Handler Function (Callback / Anonymous function)
 */

//Method descriptions below

//Purpose: When the bot is ready.
bot.on('ready', () => {
    console.log('Bot has logged in!')
})

//Purpose: When a bot sees a new message.
bot.on('messageCreate', (message) => {
    console.log('New Message!')
})
