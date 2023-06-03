package ch.hegarc.servicenotaire.trouver.service;

import ch.hegarc.servicenotaire.trouver.business.Notaire;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface ITrouverNotaireService {
    void setNotaires(Map<String, Notaire> notaires);
    Collection<Notaire> getNotaires();
    List<Notaire> findNotaire(String recherche);
    boolean authentifierNotaire(String nom, String prenom);
}
