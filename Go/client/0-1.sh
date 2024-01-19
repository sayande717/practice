# MANUAL: warn
manual_install=("adsorber" "aur")     # Sync with MANUAL: install
printf "Place these directories & corresponding files in the root directory: "
for package in ${manual_install[@]}
do
    printf "\n> $package"
done
pritnf "\n"

sleep 5

# init
pacman-key --init
pacman-key --populate
pacman -S archlinux-keyring
pacman -Syu

# install
## general
pacman -S fuse git xfce4 xfce4-goodies network-manager-applet bitwarden docker docker-compose steam p7zip libreoffice-fresh wget zip unzip net-tools telegram-desktop thunderbird obs-studio tlp android-tools easyeffects lsp-plugins-lv2 solaar libva-mesa-driver android-tools scrcpy vlc yt-dlp linssid wget okular gwenview aircrack-ng qt5-graphicaleffects audacity minidlna speedtest-cli mc screenfetch transmission-qt ntfs-3g ufw discord lutris npm spectacle rsync partitionmanager iotop lolcat traceroute gcolor3 cmatrix blueman clamav gparted progress vnstat dosfstools mtools devtools remmina libvncserver freerdp rofi rofi-calc tftp-hpa gnome-keyring seahorse xclip xsel tilix ripgrep nvim
## Lutris
pacman -S --needed wine-staging giflib lib32-giflib libpng lib32-libpng libldap lib32-libldap gnutls lib32-gnutls mpg123 lib32-mpg123 openal lib32-openal v4l-utils lib32-v4l-utils libpulse lib32-libpulse libgpg-error lib32-libgpg-error alsa-plugins lib32-alsa-plugins alsa-lib lib32-alsa-lib libjpeg-turbo lib32-libjpeg-turbo sqlite lib32-sqlite libxcomposite lib32-libxcomposite libxinerama lib32-libgcrypt libgcrypt lib32-libxinerama ncurses lib32-ncurses ocl-icd lib32-ocl-icd libxslt lib32-libxslt libva lib32-libva gtk3 lib32-gtk3 gst-plugins-base-libs lib32-gst-plugins-base-libs vulkan-icd-loader lib32-vulkan-icd-loader rsync
## development
pacman -S jdk-openjdk python gcc git python-pip python-ipykernel python-numpy python-pandas python-matplotlib python-dotenv
## QEMU, KVM & Virt-Manager
pacman -S qemu virt-manager virt-viewer dnsmasq vde2 bridge-utils openbsd-netcat ebtables iptables libguestfs qemu-ui-spice-core qemu-ui-spice-app qemu-audio-spice qemu-chardev-spice  qemu-audio-pipewire qemu-ui-spice-core qemu-ui-spice-app qemu-audio-spice qemu-chardev-spice qemu-hw-display-virtio-vga qemu-hw-display-virtio-vga-gl

## Node Package Manager
npm i -g bash-language-server

## NVChad
git clone https://github.com/NvChad/NvChad ~/.config/nvim --depth 1 && nvim

sleep 5

# MANUAL: install
## Adsorber
sh ./adsorber/place_files_onto_system.sh

## AUR
cd aur
pacman -U ttf-ms-win10-auto-*.pkg.tar.zst           \
          authy-*.pkg.tar.zst                       \
          megasync-bin-*.pkg.tar.zst                \
          brave-bin-*.pkg.tar.zst                   \
          visual-studio-code-bin-*.pkg.tar.zst      \
          librewolf-bin-*.pkg.tar.zst               \
	      python-discord-py-*.pkg.tar.zst           \
          vmware-keymaps-1.0-3-any.pkg.tar.zst      \
          vmware-workstation-17.0.2-2-x86_64.pkg.tar.zst
cd ..
