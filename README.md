# projeto-micro
Projeto MIcroservicos

>> EurekaServer http://localhost:8761/


>> RabbitMQ:
docker run -it --rm --name cursomsrabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.11-management
localhost:15672
user e pass: guest

>> Keycloak:
docker run --name cursomskeycloak -p 8081:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:18.0.0 start-dev

localhost:8081
user e pass: admin

>> Swagger
localhost:PORTA/swagger-ui/index.html

>> Docker:

Buildando a imagem:
docker build --tag cursoms-eureka .

Comando para rodar imagem:
docker run --name cursoms-eureka -p 8761:8761 cursoms-eureka

Ver os processos docker no PowerShell:
docker ps

Comando parar um container:
docker container stop teste-eureka

Comando remover container:
docker container rm teste-eureka

Deletar a imagem:
docker image rm cursoms-eureka

