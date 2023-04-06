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
docker build --tag cursoms-cartoes .

Comando para rodar imagem:
docker run --name cursoms-eureka -p 8761:8761 cursoms-eureka
docker run --name cursoms-cartoes cursoms-cartoes

Comando parar um container: docker container stop teste-eureka
Comando remover container: docker container rm teste-eureka

Criar network: docker network create cursoms-network
Mostrar network: docker network ls

Apontando para network:
docker run --name cursoms-eureka -p 8761:8761 --network cursoms-network cursoms-eureka

Rodando a imagem com network:
docker run --name cursoms-cartoes --network cursoms-network cursoms-cartoes

Sequência:
Ver os processos docker e nome dos container: docker ps
Imagens existentes: docker images
Stopar a imagem: docker stop nome-imagem
Deletar a imagem: docker rm cursoms-eureka
Inicializar o container com networke variável de ambiente:
docker run --name cursoms-cartoes --network cursoms-network -e RABBITMQ_SERVER=rabbitmq -e EUREKA_SERVER=cursoms-eureka -d cursoms-cartoes