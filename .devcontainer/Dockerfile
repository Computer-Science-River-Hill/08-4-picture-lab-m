FROM mcr.microsoft.com/vscode/devcontainers/repos/microsoft/vscode:latest

COPY fluxbox/* /tmp/fluxbox/
COPY *.sh /tmp/scripts/
RUN bash /tmp/scripts/install.sh \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/* /tmp/scripts/ /tmp/fluxbox/ \
    && git config --global codespaces-theme.hide-status 1
    
ENV DBUS_SESSION_BUS_ADDRESS="autolaunch:" \
    VNC_RESOLUTION="1440x768x24" \
    VNC_DPI="96" \
    VNC_PORT="5901" \
    NOVNC_PORT="6080" \
    DISPLAY=":1" \
    LANG="en_US.UTF-8" \
    LANGUAGE="en_US.UTF-8"
COPY desktop-init.sh /usr/local/share/
ENTRYPOINT ["/usr/local/share/desktop-init.sh"]
CMD ["sleep", "infinity"]