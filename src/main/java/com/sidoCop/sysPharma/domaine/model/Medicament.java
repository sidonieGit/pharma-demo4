package com.sidoCop.sysPharma.domaine.model;

public class Medicament {
    private int id;
    private String designation;
    private double prix;
    private String description;
    private String image;
    private Categorie categorie;

    // Constructeur complet
    public Medicament(int id, String designation, double prix, String description, String image, Categorie categorie) {
        super();// pour que l'objet soit instanciable
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.description = description;
        this.image = image;
        this.categorie = categorie;
    }

    // Constructeur simplifié
    public Medicament(int id, String designation, double prix, String description) {
        super();// pour que l'objet soit instanciable
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.description = description;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "designation='" + designation + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", categorie=" + categorie +
                '}';
    }
}
