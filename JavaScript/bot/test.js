require("dotenv").config();

const { Client } = require('discord.js');
const client = new Client();

client.on('ready', () => {
    console.log(`Idling...`);
    client.user.setPresence({
        status: 'idle',
    });
  });

client.login(process.env.Test_token);