FROM openjdk:17-oraclelinux8
WORKDIR /app
COPY ./target/kt-app-shop2.jar /app
EXPOSE 8080
ENV SYS_OPT=""
ENTRYPOINT java $SYS_OPT -jar /app/kt-app-shop2.jar
