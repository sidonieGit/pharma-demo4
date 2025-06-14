# Projet Pharma4 - Application de Gestion de Médicaments (Spring Configuration Java & Annotations)

Ce dépôt contient la quatrième itération du projet "Pharma". Cette version fait évoluer `Pharma3` en remplaçant la configuration XML de Spring par une **configuration basée sur Java et les annotations** (`@Configuration`, `@Bean`). Le DAO continue d'utiliser un objet mocké pour la persistance.

## Contexte

- **Pharma1** : Bases en Java pur avec DAO mocké.
- **Pharma2** : Introduction de l'injection de dépendances manuelle.
- **Pharma3** : Utilisation du conteneur Spring avec configuration XML pour l'IoC.
- **Pharma4** : Transition vers la **configuration Spring basée sur Java et les annotations**.

## Fonctionnalités (Démo 4)

- **Gestion des Médicaments** : Création et récupération de médicaments avec des données mockées.
- **Couches Applicatives** : Maintien des couches DAO, Domaine et Service.
- **Conteneur Spring avec Configuration Java** :
  - Le fichier `demo-beans.xml` est remplacé par une classe de configuration Java (e.g., `DemoBeanConfig.java`) annotée avec `@Configuration`.
  - Les méthodes annotées avec `@Bean` dans `DemoBeanConfig` définissent les beans Spring (`MedicamentDao`, `ServiceMedicament`) et leurs dépendances sont gérées par Spring.
  - La classe `Laucher` utilise `AnnotationConfigApplicationContext` pour charger le contexte Spring à partir de la classe de configuration Java.
  - Les méthodes de cycle de vie des beans Spring (`initialisation`, `destruction`) peuvent toujours être définies via les attributs `initMethod` et `destroyMethod` dans `@Bean` ou via des annotations spécifiques comme `@PostConstruct` et `@PreDestroy`.

## Technologies Utilisées

- Java (JDK 8 ou supérieur recommandé)
- **Maven** (pour la gestion des dépendances et du build)
- **Spring Framework** (en particulier `spring-context` pour l'injection de dépendances et la configuration Java)

## Comment Exécuter l'Application

1.  **Prérequis :**

    - Assurez-vous d'avoir le [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) installé (version 8 ou supérieure).
    - Assurez-vous d'avoir [Maven](https://maven.apache.org/download.cgi) installé et configuré.

2.  **Cloner le dépôt :**

    ```bash
    git clone https://github.com/sidonieGit/pharma-Demo4.git
    cd Pharma4
    ```

3.  **Construire le projet et télécharger les dépendances (via Maven) :**
    La commande `mvn clean install` va nettoyer les builds précédents, compiler le code, exécuter les tests (s'il y en a), packager l'application et l'installer dans votre dépôt Maven local. Elle téléchargera également toutes les dépendances Spring.

    ```bash
    mvn clean install
    ```

4.  **Exécuter l'application (depuis l'IDE) :**
    - Importez le projet `Pharma4` dans votre IDE (IntelliJ IDEA, Eclipse, VS Code) comme un projet Maven existant.
    - Exécutez la classe `com.sidoCop.sysPharma.launcher.Laucher` en tant qu'application Java.
    - Vous devriez voir les messages de console indiquant le chargement du contexte Spring à partir de la configuration Java, l'appel aux méthodes de cycle de vie du DAO, et l'exécution de la logique métier.

## Prochaines Étapes Possibles

- Le `MedicamentDao` contient le **squelette du code JDBC** pour la gestion des connexions, statements et result sets. Cependant, les méthodes de persistance (CRUD) **retournent toujours des données mockées** ou affichent des messages de simulation.

---

**Auteur :**

- Sidonie sidoniedjuissifohouo@gmail.com---

- www.linkedin.com/in/sidonie-djuissi-fohouo

**Date :** 12 juin 2025
