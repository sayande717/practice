from flask import Flask
from threading import Thread

web = Flask('')

@web.route('/')
def home():
   return 'Running'

def run():
  web.run(host='0.0.0.0',port=8080)

def keep_alive():
   run_thread = Thread(target=run)
   run_thread.start()