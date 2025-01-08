FROM jenkins/jenkins
USER root
RUN curl -sSL https://get.docker.com/ | sh
RUN apt update && apt install -y iputils-ping && apt install -y wget && apt install -y acl
USER jenkins
#setfacl -m u:jenkins:rw /var/run/docker.sock
