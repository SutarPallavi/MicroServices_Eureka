# MicroServices_Eureka
MicroServices Eureka Service Registry example
it has three modules
1. Eureka: as service registry which contains Eureka server dependency, Port: 8761
2. CustomerService: contains Eureka client dependency. Uses Feign client to connect with CartService to add items to the cart. Port: 8090
3. CartServices: contains Eureka client dependency. Port: 8095

Important properties to mention in app.properties or app.yaml
Client:
1. eureka.instance.preferIpAddress = true 
2. eureka.client.registerWithEureka = true
3. eureka.client.fetchRegistry = true
4. eureka.client.serviceUrl.defaultZone = http://localhost:8761/eureka

Server:
1. eureka.instance.hostname=localhost
2. eureka.client.registerWithEureka=false
3. eureka.client.fetchRegistry=false
4. eureka.client.serviceUrl.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka

APIs:
Customer service- GET API: http://localhost:8090/add/{item_id}

Cart Service - Get API: http://localhost:8090/addToCart/{item_id}

Eureka Server: http://localhost:8761/
