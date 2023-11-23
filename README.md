# TP INFO 4067

## **À Propos**

Ce projet vise à mettre en œuvre différents modèles de conception dans le cadre de l'UE INF4067 intitule UML et Design pattern. Vous trouverez des détails spécifiques pour chaque implémentation dans ce document. Le code de ce projet est stocke dans un repositry github à l'adresse: **https://github.com/Codeur16/Design_pattern_INF4067.git**

Bienvenue dans le monde Java VS Code. Voici un guide pour vous aider à commencer à écrire du code Java dans Visual Studio Code.

## Structure du dossier 

The workspace contains two folders by default, where:

- `src`: le dossier pour conserver les sources
  - `.com`: le dossier contenant les packages du projet, et chaque package correspond a une implementation d'un DP
    - `abstractfactory`: le dossier contenant le pattern **Abstract factory**
    - `Builder`: le dossier contenant le pattern **Builder**
    - `factorymethod`: le dossier contenant le pattern **factorymethod**
    - `factorymethod_3_product`: le dossier contenant le pattern **Abstract factory** avec une implementation de 3 produits
    - `singleton`: le dossier contenant le pattern **Singleton**
  
  > Pendant ce temps, les fichiers de sortie compilés seront générés par défaut dans le dossier « bin ».

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).





## COMMENCER:
- [TP INF4067](#tp-info-4067)
    - [Sujets](#sujet)
    - [Prérequis](#1-prérequis)
    - [Tests](#2-tests)
    - [Introduction](#Introduction)
    - [Pattern Factory](#Pattern-factory)
    - [Utilisation d'une méthode de fabrique](#Utilisation-d'une-méthode-de-fabrique)
    - [Utilisation d'une classe abstraite de fabrique](#Utilisation-d'une-classe-abstraite-de-fabrique)
    - [Abstract Factory](#Abstract-Factory)
    - [Singleton](#Singleton)
    - [Builder](Builder)


## 1. **Prérequis**

Assurez-vous d'avoir l'environnement Java correctement installé (JDK, JRE). Suivez les instructions d'installation disponibles sur Java.com.

## 2. **Tests**

Le projet est divise en dossier situer a la racine, chaque dossier correspond a l'implementation d'un pattern de construction. Pour effectuer les tests, il faut d'abord cloner le projet dans votre environment, puis lancer en temps que appli JAVA

3. **Introduction**

Dans le cadre du cours INF4067 sur "UML et Design Patterns", ce projet met en œuvre différents modèles de construction. Voici un aperçu de chaque implémentation.

4. **Pattern Factory**

Le Pattern Factory est un modèle de construction permettant de créer des objets dont le type dépend du contexte. Il est utilisé lorsque le client ne peut pas déterminer préalablement le type d'objet à créer, le déterminant uniquement à l'exécution.

-**Implementation**
  **Product Factory Class**



    
 1.  **Utilisation d'une méthode de fabrique (Abstract Factory)**
Dans ce cas, une fabrique concrète contient une méthode de fabrication où un switch case ou des if déterminent l'objet à créer. Une classe produit abstraite est utilisée pour instancier les sous-classes concrètes.



 42.   **Utilisation d'une classe abstraite de fabrique (Factory)**
Une fabrique abstraite contient les signatures des méthodes de fabrication, avec des fabriques concrètes pour chaque type d'objet. Une classe produit abstraite est utilisée pour instancier les sous-classes concrètes.



1. **Abstract Factory**

L'Abstract Factory est utilisée pour créer des objets regroupés en famille sans connaître leurs classes concrètes. 
  - Resultat apres execution du client.java:
    - Utilisation de la premiere fabrique
    - Je suis un produit A1
    - ProduitA1.MethodeA
    - Je suis un produit B1
    - ProduitB1.MethodeB
    - Utilisation de la seconde fabrique
    - Je suis un produit A2
    - ProduitA2.MethodeA
    - Je suis un produit B2
    - ProduitB2.MethodeB
1. **Singleton**

Le modèle Singleton garantit qu'une classe possède une seule instance et offre un accès global à celle-ci. 

1. **Builder**

Le modèle Builder permet de créer des objets complexes à partir d'objets sources. 


