import discord,os,time
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Status_token')

client = discord.Client()

@client.event
async def on_ready():
    await client.change_presence(status='dnd',activity=discord.Activity(type=discord.ActivityType.watching, name='System Status'))
    print('Status bot logged in.')

@client.event
async def on_message(message):
    if message.author.bot:
        return
    else:
        msg = message.content
        msglow = message.content.lower()
        #Works in admin-chat channel only.
        if message.channel.id == 940487185973530655:
            commandlist = [['help','1. Ping: **pwan**,**plan**\n2. **up**: uptime\n3. **log2ram**\n4. **ram**'],
                            ['pwan','ping 1.1.1.1 -c 1'],
                            ['plan','ping 192.168.1.1 -c 1'],
                            ['up','uptime'],['ram','free -h'],
                            ['log2ram','df -h | grep log2ram'],
                            ['cputemp','vcgencmd measure_temp']]
            if msg == commandlist[0][0]:
                    await message.channel.send(commandlist[0][1])
            else:
                for i in range (1,len(commandlist)):
                    if msg == commandlist[i][0]:
                        await message.channel.send(os.popen(commandlist[i][1]).read())
        #Works in all channels
        #Delete messages containing certain keywords
        msgtodel = ['abcd','def','fuck']
        for i in range (len(msgtodel)):
            if msglow.find(msgtodel[i]) != -1:
                await message.delete()
                botmsg = await message.channel.send('**Message deleted because of banned word(s).**\nNote: Check the **#rules** channel for server rules.')
                time.sleep(4)
                await botmsg.delete()

client.run(TOKEN)