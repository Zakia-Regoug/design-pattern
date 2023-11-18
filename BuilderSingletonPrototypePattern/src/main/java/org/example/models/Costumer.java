package org.example.models;

public class Costumer implements Cloneable{
    private Long id;
    private String nom;

    public Costumer(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Costumer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public Costumer clone() throws CloneNotSupportedException {
        return(Costumer) super.clone();
    }
}
