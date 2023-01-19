# Import from common.py
from common import *

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

# Scope: Server command Information / Help
@bot.command()
async def info(ctx):
    # Channel = Self > #commands
    if ctx.channel.id == 940487185973530655:
        await ctx.channel.send('\
            \n---Command info---\
            \n \
            \n1. Commands invoked under **.run**:\
            \nSyntax: .run <argument0> <argument1>\
            \n> **up**: Display system uptime.\
            \n> **ram**: Check the amount of free RAM.\
            \n> **vol <0-100>**: Increase/Decrease the volume.\
            \n> **temp**: Check current CPU Temperature.\
            \n> **load**: Check current CPU Load.\
            \n> **ifconfig <interface_name>**: Check network interface status.\
            \n \
            \n2. Commands invoked independently: \
            \na. **ping**:\
            \nSyntax: .ping <argument> \
            \n> **argument**: IPv4 Address to ping.\
            \n> Examples: [lan0,lan1,wan] *or* custom IPv4 Address. \
            \nb. **vol** aka *volume*:\
            \nSyntax: .vol <0-100>\
        ')


# Scope: All server commands except:
# [ ping, vol ]
@bot.command()
async def run(ctx, arg0, arg1=''):
    # Channel = Self > #commands
    if ctx.channel.id == 940487185973530655:
        # Command DB for which to return the system output.
        commandDBSystemOutput = {
            # 1 Argument
            # System & CPU
            'up': 'uptime',
            'temp': 'vcgencmd measure_temp',
            'load': 'cat /proc/loadavg',
            # RAM
            'ram': 'free -h',
            'time': 'date',

            # 2 Arguments
            'ifconfig': f'ifconfig {arg1}'
        }
        try:
            # Display the system output.
            await ctx.channel.send(os.popen(commandDBSystemOutput[arg0]).read())
        except KeyError:
            await ctx.channel.send(getString(0,'mistake'))

# Scope: Server command: ping
@bot.command()
async def ping(ctx, arg):
    # Channel = Self > #commands
    if ctx.channel.id == 940487185973530655:
        # List of common ping aliases
        pingAlias = {
            # Internet IPv4 Address
            'wan': '1.1.1.1',

            # LAN Gateways
            'lan0': '10.0.27.1', # Internet Gateway
            'lan1': '10.10.0.1',  # Internal Gateway

        }
        # Run the command and print the system output.
        await ctx.channel.send(os.popen(f'ping -I eth0 {pingAlias.get(arg,arg)} -c 3').read())

# Scope: Server command: vol
@bot.command()
async def vol(ctx, arg):
    # Channel = Self > #commands
    if ctx.channel.id == 940487185973530655:
        try:
            # Execute the command
            os.popen(f'amixer sset Master {int(arg)}%')
            # Print a custom output
            await ctx.channel.send(f'Volume set to **{arg}%**')
        except ValueError:
            await ctx.channel.send(getString(0, 'mistake'))
            

bot.run(TOKEN)
