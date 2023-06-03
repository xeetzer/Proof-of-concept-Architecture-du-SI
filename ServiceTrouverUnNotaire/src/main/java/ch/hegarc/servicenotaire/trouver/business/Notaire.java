package ch.hegarc.servicenotaire.trouver.business;

import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

public class Notaire {
    private String titre;
    private String nom;
    private String prenom;
    private String adresse;
    private String residenceNotariale;
    private String email;
    private transient String motDePasse;

    public Notaire() { }

    public Notaire(String[] properties) {
        if (properties.length < 6) {
            throw new IllegalArgumentException(String.format("The properties array should contain at least 6 items but it contains only %d items", properties.length));
        }

        titre = properties[0];
        nom = properties[1];
        prenom = properties[2];
        adresse = properties[3];
        residenceNotariale = properties[4];
        email = properties[5];
        motDePasse = properties[6];
    }

    public boolean match(String recherche) {
        String everything = this.titre + this.nom + this.prenom + this.adresse + this.residenceNotariale + this.email;
        return everything.toUpperCase().contains(recherche.toUpperCase());
    }

    @Override
    public String toString() {
        return "Notaire{" +
                "titre='" + titre + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", residenceNotariale='" + residenceNotariale + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getResidenceNotariale() {
        return residenceNotariale;
    }

    public void setResidenceNotariale(String residenceNotariale) {
        this.residenceNotariale = residenceNotariale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
