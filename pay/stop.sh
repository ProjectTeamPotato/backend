#!/usr/bin/env bash


RUN_PID=$(lsof -ti tcp:443)

if [ -z ${RUN_PID} ]
then
  echo "Not anything run"
else
  echo "Shutdown Spring boot Application"
  kill -15 ${RUN_PID}
  #이거 안해주면 start.sh가 무시됨
  sleep 15
fi