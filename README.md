# spring-boot-real-rest-api-demo
'Real' REST API demo project for Spring Boot inspired by [‘그런 REST API로 괜찮은가’](https://www.youtube.com/watch?v=RP_f5dMoHFc)

Environments:
```
java 11.0.1
maven 3.3.9
docker 18.09.0
```
`docker run --name rest -p 5432:5432 -e POSTGRES_PASSWORD=pass -d postgres`

Package:
```
$ mvn package
```
Start the server:
```
$ java -jar target/spring-boot-real-rest-api-demo-0.0.1-SNAPSHOT.jar
```
Check REST API Docs `http://localhost:8080/docs/index.html`
