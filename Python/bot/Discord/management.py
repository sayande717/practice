# Import from common.py
from common import getChannelID, getStrMistake

from discord.ext import commands
import discord
import os

# Import Bot Token
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Management')


# Bot Intents
intent = discord.Intents.default()
intent.message_content = True

# Bot Command prefix
bot = commands.Bot(intents=intent, command_prefix='.')


@bot.event
async def on_ready():
    await bot.change_presence(status=discord.Status.dnd)

# Channel ID to listen to, for commands
commandChannelID = getChannelID('Self', 'commands')


@bot.command()
async def info(ctx):
    if ctx.channel.id == commandChannelID:
        await ctx.channel.send('\
            \n---Command info---\
            \n \
            \n1. Commands invoked under **.run**:\
            \nSyntax: .run <argument0> <argument1>\
            \n> **up**: Display system uptime.\
            \n> **ram**: Check the amount of free RAM.\
            \n> **vol <0-100>**: Increase/Decrease the volume.\
            \n> **log2ram**: Check Log2RAM status.\
            \n> **temp**: Check current CPU Temperature.\
            \n> **load**: Check current CPU Load.\
            \n> **ifconfig <interface_name>**: Check network interface status.\
            \n \
            \n2. Commands invoked independently: \
            \na. **ping**:\
            \nSyntax: .ping <argument0> <argument1>\
            \n> **argument0**: IPv4 Address to ping.\
            \n> Examples: [lan0,lan1,wan] *or* custom IPv4 Address. \
            \n> **argument1**: Target Network Interface.\
            \n> Examples: [wan0,wan1] *or* custom Network Interface.\
            \n \
            \nb. **vol** aka *volume*:\
            \nSyntax: .vol <0-100>\
        ')


# Run all commands on the server except:
# [ping,vol]
@bot.command()
async def run(ctx, arg0, arg1=''):
    if ctx.channel.id == commandChannelID:
        # Command DB for which to return the system output.
        commandDBSystemOutput = {
            # 1 Argument
            # System & CPU
            'up': 'uptime',
            'temp': 'vcgencmd measure_temp',
            'load': 'cat /proc/loadavg',
            # RAM
            'ram': 'free -h',
            'log2ram': 'df -h | grep log2ram',
            'time': 'date',

            # 2 Arguments
            'ifconfig': f'ifconfig {arg1}'
        }
        try:
            # Display the system output.
            await ctx.channel.send(os.popen(commandDBSystemOutput[arg0]).read())
        except KeyError:
            await ctx.channel.send(getStrMistake())


@bot.command()
async def ping(ctx, arg0, arg1='wan0'):
    if ctx.channel.id == commandChannelID:
        # List of common ping aliases
        pingAlias = {
            # Internet IPv4 Address
            'wan': '1.1.1.1',

            # LAN Gateways
            'lan0': '192.168.29.1',  # JioFiber
            'lan1': '192.168.1.1',  # JioDongle

            # WAN Interfaces
            'wan0': 'eth0',  # JioFiber
            'wan1': 'wlan0'  # JioDongle
        }
        # Run the command and print the system output.
        await ctx.channel.send(os.popen(f'ping -I {pingAlias.get(arg1,arg1)} {pingAlias.get(arg0,arg0)} -c 3').read())


@bot.command()
async def vol(ctx, arg):
    if ctx.channel.id == commandChannelID:
        try:
            # Execute the command
            os.popen(f'amixer sset Master {int(arg)}%')
            # Print a custom output
            await ctx.channel.send(f'Volume set to **{arg}%**')
        except ValueError:
            await ctx.channel.send(getStrMistake())


bot.run(TOKEN)
