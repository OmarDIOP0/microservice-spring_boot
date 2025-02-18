# # Utiliser l'image OpenJDK 17 comme image de base
# FROM openjdk:17-jdk-slim

# # Répertoire de travail dans le conteneur
# WORKDIR /app

# # Copier tous les fichiers JAR des différents modules dans le conteneur
# COPY microservice-app/customer/target/customer-1.0-SNAPSHOT.jar /app/customer.jar
# COPY microservice-app/fraud/target/fraud-1.0-SNAPSHOT.jar /app/fraud.jar
# COPY microservice-app/eureka-server/target/eureka-server-1.0-SNAPSHOT.jar /app/eureka-server.jar

# # Exposer les ports nécessaires (adaptez selon les services)
# EXPOSE 8080 8761

# # Commande pour démarrer l'application (ici, on lance le service Eureka en premier, puis le service Customer et Fraud)
# CMD ["sh", "-c", "java -jar /app/eureka-server.jar & java -jar /app/customer.jar & java -jar /app/fraud.jar"]
