#!/usr/bin/env bash


RUN_PID=$(lsof -ti tcp:443)

if [ -z ${RUN_PID} ]
then
  echo "Not anything run"
else
  echo "Shutdown Spring boot Application"
  kill -15 ${RUN_PID}
fi