import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Admin')
client = discord.Client()

'''
Tasks:
1. System status
2. Pinning message(s) on any channel.
'''

@client.event
async def on_ready():
    await client.change_presence(status='dnd', activity=discord.Activity(type=discord.ActivityType.watching, name='Server Status'))
    print('Admin bot running.')

    #Type in a new channel ID here. Format: '<channel-name>',<Channel ID>
    '''
    ch = client.get_channel(982255693748908062)
    sendmsg = await ch.send("5. channel-name -> 00000000")
    await sendmsg.pin()
    '''

@client.event
async def on_message(message):
    msg = message.content
    if message.author.bot:
        return
    elif message.channel.id == 982255693748908062:
        '''
        Pin a message in any channel.
        Syntax: 
        <Channel ID>%%
        line 1
        line 2
        '''
        msg = msg.split("%%")
        ch = client.get_channel(int(msg[0]))
        sendmsg = await ch.send(msg[1])
        await message.delete()
        await sendmsg.pin()
    #System status. Works in admin-general channel only.
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
