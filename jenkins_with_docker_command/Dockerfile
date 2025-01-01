FROM jenkins/jenkins
USER root
RUN curl -sSL https://get.docker.com/ | sh
RUN apt update
RUN apt install -y iputils-ping
RUN apt install -y wget
USER jenkins
