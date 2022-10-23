#!/usr/bin/env bash

# 로그 따로 저장
nohup java -jar build/libs/pay.jar > /logs/nohup.log 2>&1 &