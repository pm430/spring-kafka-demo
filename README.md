
## 1. docker 실행
```aiignore
docker-compose up -d
```

## 2. docker 확인
```aiignore
docker-compose ps
```

## 3. topic 생성
```aiignore
docker exec -it {your-kafka-container-name} kafka-topics --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

## 4. 애플리케이션 실행 후 테스트
```aiignore
curl -X POST "http://localhost:8080/api/publish?message=hello"
```

## * 컨테이너 중지 및 삭제
```aiignore
docker-compose down
```