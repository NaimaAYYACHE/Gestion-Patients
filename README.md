# Gestion des Patients avec Spring Boot

## Description du Projet

Ce projet est une application de gestion des patients développée avec Spring Boot, Thymeleaf et MySQL. L'application implémente différentes stratégies d'authentification de Spring Boot pour les utilisateurs. Il existe trois versions distinctes, chacune avec sa propre stratégie d'authentification (In Memory Authentication, JDBC Authentication, UserDetailsService Authentication). Le projet comprend également des fonctionnalités de validation de formulaire, des mises en page Thymeleaf, et des opérations CRUD pour les utilisateurs ayant différents rôles.

## Fonctionnalités

- Visualisation de la liste des patients
- Recherche de patients par nom
- Ajout, modification et suppression de patients (pour le rôle admin)

## Stratégies de Sécurité Utilisées

1. **In Memory Authentication :** Stocke les informations d'authentification en mémoire. Simple à mettre en œuvre mais non recommandée pour les applications en production en raison de risques de sécurité potentiels.

2. **JDBC Authentication :** Utilise JDBC pour valider les informations d'authentification à partir d'une base de données. Plus sécurisée que l'authentification en mémoire car les informations d'identification sont stockées dans une base de données.

3. **UserDetailsService Authentication :** Utilise une implémentation personnalisée de l'interface UserDetailsService de Spring Security. Permet de charger les détails de l'utilisateur à partir d'une source de données personnalisée, offrant une flexibilité accrue pour la gestion des utilisateurs.

## Table des Matières

- [Installation](#installation)
- [Utilisation](#utilisation)
- [Captures d'Écran](#captures-décran)

## Installation

### Prérequis

Avant de pouvoir exécuter l'application, assurez-vous d'avoir les dépendances suivantes installées sur votre système :

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org/)
- [MySQL](https://www.mysql.com/)

### Étapes d'Installation

1. Clonez ce référentiel sur votre machine locale.
2. Importez le projet dans votre IDE favori.
3. Configurez la base de données MySQL avec les informations appropriées dans le fichier application.properties.
4. Exécutez l'application depuis votre IDE ou en ligne de commande.

## Utilisation

Une fois l'application installée, suivez ces étapes pour l'exécuter sur votre système :

1. Assurez-vous que votre environnement de développement est correctement configuré.
2. Ouvrez votre terminal et accédez au répertoire racine du projet.
3. Exécutez la commande suivante pour démarrer l'application :

```bash
java -jar nom_de_votre_fichier.jar
````
4. Ouvrez votre navigateur web et allez à l'URL suivante : localhost:8083.
   
## Captures d'Écran

### Page d'Authentification
![WhatsApp Image 2023-10-13 at 23 49 49](https://github.com/NaimaAYYACHE/skydash/assets/105889744/50647af0-86fe-49f6-8f6c-43e1bee2fb47)

### Connecté en tant qu'admin
- Liste des Patients <br>  <br> 
  ![Capture d’écran 2023-10-13 214933](https://github.com/NaimaAYYACHE/skydash/assets/105889744/7b76431a-6f87-4810-8323-b7e97ae896da)
  <br>  <br> 
- Ajout d'un Patient <br>  <br> 
 ![Capture d’écran 2023-10-13 215046](https://github.com/NaimaAYYACHE/skydash/assets/105889744/b7feeeb8-898f-46f2-bf84-10c3d5aec8c4) <br>
 ![Capture d’écran 2023-10-13 230205](https://github.com/NaimaAYYACHE/skydash/assets/105889744/c3662456-997d-42d8-bf48-d79e2042d5f7)
 <br>  <br> 
- Validation des Champs <br>  <br> 
 ![Capture d’écran 2023-10-13 215230](https://github.com/NaimaAYYACHE/skydash/assets/105889744/411e94e7-302c-48e6-bd69-2dd02c0a5c72)
 <br>  <br> 

- Recherche par Nom <br>  <br> 
  ![Capture d’écran 2023-10-13 215529](https://github.com/NaimaAYYACHE/skydash/assets/105889744/0eb6e021-ff10-4581-afae-486e8e8fc411)
  <br>  <br> 
- Modification d'un Patient <br>  <br> 
  ![Capture d’écran 2023-10-13 230309](https://github.com/NaimaAYYACHE/skydash/assets/105889744/b14ec95f-3622-49cc-8b8a-e5d95436867f) <br>
  ![Capture d’écran 2023-10-13 215558](https://github.com/NaimaAYYACHE/skydash/assets/105889744/3f215521-80d0-41ba-a7ca-03a8980d7497)
   <br>  <br> 

- Suppression d'un Patient <br>  <br> 
  ![Capture d’écran 2023-10-13 215609](https://github.com/NaimaAYYACHE/skydash/assets/105889744/a7790a16-a110-40c4-8ac2-651b4a6df2b3) <br>
  ![Capture d’écran 2023-10-13 215625](https://github.com/NaimaAYYACHE/skydash/assets/105889744/36a5e7db-1586-4ba0-bd37-f140be0f2183) <br>  <br> 
- Déconnexion  <br>  <br>
 ![Capture d’écran 2023-10-13 230055](https://github.com/NaimaAYYACHE/skydash/assets/105889744/17761e0f-5164-4d75-b68e-c89bdb131f67)

<br>
### Connecté en tant que user1 <br>  <br> 
![Capture d’écran 2023-10-13 224226](https://github.com/NaimaAYYACHE/skydash/assets/105889744/4f4b98d5-7af4-4b86-a4a5-ccd69aef2e83) 
<br>  <br> 
- Liste des Patients <br>  <br> 
  ![Capture d’écran 2023-10-13 214647](https://github.com/NaimaAYYACHE/skydash/assets/105889744/3f8e0c7a-03bf-463c-99fe-f24a5a97272d)
  <br>  <br> 

- Recherche par Nom <br>  <br> 
  ![Capture d’écran 2023-10-13 214402](https://github.com/NaimaAYYACHE/skydash/assets/105889744/f45772f8-e840-4138-9770-e9dba2cd9a0f) <br>  <br> 


### Test de Modification via le chemin <br>  <br> 
![Capture d’écran 2023-10-13 215813](https://github.com/NaimaAYYACHE/skydash/assets/105889744/a0c243eb-434d-436f-8018-9fabaafe3e72)





