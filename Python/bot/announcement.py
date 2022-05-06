import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Announcement_token')
client = discord.Client()

'''
Tasks:
1. Announcements
Message syntax: <Message>%%<channel ID>

2. System status
'''

#Status: Active
@client.event
async def on_ready():
    await client.change_presence(status='dnd',activity=discord.Activity(type=discord.ActivityType.watching, name='Announcements'))
    print('Announcement bot running.')

@client.event
async def on_message(message):
    msg = message.content
    if message.author.bot:
        return
    #Announcements
    elif message.channel.id == 955875394119172176:
        if msg == '%help':
            await message.channel.send("Syntax: \n<**Message start...**\n**...message end**>\n%%<**Channel ID**>")
        else:
            msg = msg.split('%%')
            msgch = client.get_channel(int(msg[1]))
            await msgch.send(msg[0])
    #System status. Works in admin-chat channel only.
    elif message.channel.id == 940487185973530655:
        commandlist = [['%help','1. Ping: **pwan**,**plan**\n2. uptime: **up**\n3. **log2ram**\n4. **ram**\n5. **cputemp**'],
                        ['pwan','ping 1.1.1.1 -c 1'],
                        ['plan','ping 10.1.41.19 -c 1'],
                        ['up','uptime'],
                        ['ram','free -h'],
                        ['log2ram','df -h | grep log2ram'],
                        ['cputemp','vcgencmd measure_temp']]
        if msg == commandlist[0][0]:
                await message.channel.send(commandlist[0][1])
        else:
            for i in range (1,len(commandlist)):
                if msg == commandlist[i][0]:
                    await message.channel.send(os.popen(commandlist[i][1]).read())

client.run(TOKEN)