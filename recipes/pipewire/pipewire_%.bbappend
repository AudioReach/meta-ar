#Add pipewire user to kmem group
USERADD_PARAM:${PN} = "--system --home / --no-create-home \
                       --comment 'PipeWire multimedia daemon' \
                       --gid pipewire --groups audio,video,kmem \
                       pipewire"
