# Reservation




## error


* An attempt was made to access a socket in a way forbidden by its access permissions
   - 도커 컨테이너가 실행되지 않는 에러
   - `netsh interface ipv4 show excludedportrange protocol=tcp` 윈도우기준으로 확인해보면 사용할수없는 포트 목록이 나오는데 분명히 여기에 해당 컨테이너가 reserve 하려는 포트가 있을거임
   - 해결법은 재부팅 (PC)

* UnknwonHostException
  - docker-compose에서 따로 Hostname을 지정안해주면 지멋대로 hostname이 박아지는데 이거때문에 에러남 (컨테이너의 hosts 파일에 설정이 제대로 안되서 원인 발생)