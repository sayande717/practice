# input
read -p 'Enter username: ' user
read -p 'Enter 1 for backup, 2 for restore: ' choice

if [ $choice -eq 1 ]
then # backup
    rsync -a --exclude '.cache' --exclude '.bash_history' \
        /home/$user/.[^.]* ./1/
    rsync -a \
        /home/$user/code/production/* ./2/
    rsync -a \
        /etc/* ./3/
    rsync -a \
        /usr/local/* ./4/
    rsync -a \
        /var/lib/* ./5/
    rsync -a \
        /var/games/* ./6/
    rsync -a --exclude .cache --exclude '.bash_history' \
        /root/.[^.]* ./7/

else # restore
    rsync -a ./1/.[^.]* /home/$user/
    rsync -a ./2/* /home/$user/code/production/
    rsync -a ./3/* /etc/
    rsync -a ./4/* /usr/local/
    rsync -a ./5/* /var/lib/
    rsync -a ./6/* /var/games/
    rsync -a ./7/* /root/

    # EXTRA
    usermod -aG docker $user                        # Docker
    modprobe -a vmw_vmci vmmon                      # Enable VMWare modules
fi

printf "Rebooting in 10 seconds... \n"
sleep 10
systemctl reboot
