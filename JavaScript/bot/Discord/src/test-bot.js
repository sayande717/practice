require('dotenv').config();
const { token } = process.env;
const { Client, Collection } = require('discord.js')
const fs = require('fs');

const bot = Client({ intents: GatewayIntentBits.Guilds })
bot.commands = new Collection();
