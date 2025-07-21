# 베이스 이미지 자바 17
FROM eclipse-temurin:17-jdk

# 작업 디렉토리
WORKDIR /app

# JAR 파일 위치 지정
ARG JAR_DIR=build/libs/app.jar

# JAR 파일을 컨테이너에 복사
COPY ${JAR_DIR} app.jar

# 컨테이너에서 실행할 명령
ENTRYPOINT ["java", "-jar", "app.jar"]

# Docker 이미지 빌드
# docker build -t my-app .

# Docker 컨테이너 실행
# docker run -d -p 8080:8080 my-app