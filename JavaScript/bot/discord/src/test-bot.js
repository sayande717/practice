import { Client, GatewayIntentBits } from 'discord.js';
import { config } from 'dotenv';
config()

const bot = new Client({
    intents: [
        GatewayIntentBits.Guilds,
        GatewayIntentBits.GuildMessages,
        GatewayIntentBits.MessageContent
    ]
}) 
const TOKEN = process.env.Test_Local;

bot.login(TOKEN)


bot.on('ready', () => 
{
    console.log('Test bot has logged in!')
})

bot.on('messageCreate',(message) => 
{
    console.log('New Message!')
})