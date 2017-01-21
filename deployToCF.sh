#!/bin/sh
# /usr/local/bin/cf login -a https://api.local.pcfdev.io -u admin -p admin -o pcfdev-org -s pcfdev-space --skip-ssl-validation
# /usr/local/bin/cf push doug-study-app -p /users/shared/jenkins/home/Workspace/DougStudyAppSpring\ Freestyle/target/dougstudyappspring-0.0.1-SNAPSHOT.JAR
/usr/local/bin/cf login -a https://api.run.pivotal.io -u doug.safford@yahoo.com -p duckdodgers -o doug.safford-org -s development  --skip-ssl-validation
/usr/local/bin/cf push cardrandomizerweb -p /users/shared/jenkins/home/Workspace/cardrandomizerweb/target/cardrandomizerweb-0.0.1-SNAPSHOT.JAR
