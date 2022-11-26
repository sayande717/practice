require('dotenv').config(); //Require this particular npm package.
const { Client } = require('discord.js'); //Import the 'Client' class from the Discord.js package.
const bot = new Client(); //Object 'bot' is an instance of the Client class (from Discord.js).

bot.login(process.env.Test-bot); //Bot login method. It logs the bot in using the 'Test-bot' token from '.env'.