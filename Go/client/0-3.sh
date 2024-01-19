services=("docker" \
           "tlp"   \
           "ufw"   \
           "libvirtd" \
        )

systemctl daemon-reload

for service in "${services[@]}"
do
    systemctl start $service
    systemctl enable $service
done

# EXTRA
ufw enable
adsorber enable