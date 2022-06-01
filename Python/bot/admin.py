import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Admin')
client = discord.Client()

'''
Task: System status
'''

#Status: Active
@client.event
async def on_ready():
    await client.change_presence(status='dnd', activity=discord.Activity(type=discord.ActivityType.watching, name='Server Status'))
    print('Admin bot running.')

@client.event
async def on_message(message):
    msg = message.content
    if message.author.bot:
        return
    #Send a message on the #bot-updates channel and pin it. Channel ID=944658998550999060
    elif message.channel.id == 944658998550999060:
        if msg == '%get':
            sendmsg = await message.channel.send('[01/06/2022 | 08:32]:\nThe Admin Bot will now send the update message(s) & pin them here, all by itself! :grin:')
            await message.delete()
            await sendmsg.pin()
    #System status. Works in admin-chat channel only.
    elif message.channel.id == 940487185973530655:
        commandlist = [['%help','1. Ping: **pwan**,**plan1,2**\n2. uptime: **up**\n3. **log2ram**\n4. **ram**\n5. **cputemp**'],
                        ['pwan','ping 1.1.1.1 -c 1'],
                        ['plan1','ping 10.0.17.23 -c 1'],
                        ['plan2','ping 192.168.29.1 -c 1'],
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
