# Microservices Application with Spring Boot, pgAdmin/PostgreSQL and Eureka Server 

## Description
Ce projet est une application basée sur une architecture de microservices utilisant **Spring Boot**. Il contient deux services principaux : 
- **Customer Service** : pour gérer les informations des clients.
- **Fraud Service** : pour vérifier si un client est frauduleux.

La base de données **PostgreSQL** est utilisée pour le stockage, et **pgAdmin** est utilisé pour la gestion de la base de données.

Le **Eureka Server** va permettre de gerer la communication et les instances des microservices

---

## Architecture
Voici un aperçu des microservices :
1. **Customer Service**
   - Permet de gérer les clients (ajout, mise à jour, suppression, consultation).
   - Communique avec le Fraud Service pour vérifier les fraudes.
2. **Fraud Service**
   - Permet de vérifier si un client est frauduleux ou non.
   - Stocke les enregistrements des clients signalés comme fraudeurs.
3. **Eureka Server**
   - Permet de centraliser les microservices
   - Permet de faire la communication entre les microservices
   - Permet de gerer les instances des microservices

Chaque microservice utilise sa propre base de données **PostgreSQL**.

---

## Prérequis
Avant de commencer, assurez-vous d'avoir installé :
- **Java 17** ou une version supérieure
- **Maven** (pour la gestion des dépendances)
- **Docker** et **Docker Compose** (pour exécuter PostgreSQL et pgAdmin)
- **Postman** ou un outil similaire pour tester les API

---

## Installation et configuration

### Étape 1 : Cloner le projet
```bash
git clone https://github.com/OmarDIOP0/microservice-spring_boot.git
cd microservice-spring_boot
```
### 2. Install maven

```bash	
   mvn clean install
```	

### 3. Run docker composer

```bash	
   docker composer up -d
```

### 4. Run Spring Boot Application

```bash	
   mvn spring-boot:run
```