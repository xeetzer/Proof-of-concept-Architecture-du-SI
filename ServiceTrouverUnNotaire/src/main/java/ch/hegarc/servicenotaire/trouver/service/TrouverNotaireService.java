package ch.hegarc.servicenotaire.trouver.service;

import ch.hegarc.servicenotaire.trouver.business.Notaire;

import javax.jws.WebService;
import java.util.*;
import java.util.stream.Collectors;

@WebService
public class TrouverNotaireService implements ITrouverNotaireService {
    private Map<String, Notaire> notaires = new HashMap<>();

    public void setNotaires(Map<String, Notaire> notaires) {
        this.notaires = notaires;
    }

    @Override
    public Collection<Notaire> getNotaires() {
        return notaires.values();
    }

    @Override
    public List<Notaire> findNotaire(String recherche) {
        String[] searchTerms = recherche.split(" ");

        List<Notaire> matchingNotaires = new ArrayList<>();
        for (Notaire notaire : notaires.values()) {
            boolean matchEverything = true;
            for (String term : searchTerms) {
                if (!notaire.match(term)) {
                    matchEverything = false;
                }
            }

            if (matchEverything) {
                matchingNotaires.add(notaire);
            }
        }

        return matchingNotaires;
    }

    @Override
    public boolean authentifierNotaire(String email, String motDePasse) {
        Notaire notaire = notaires.get(email);
        if (notaire == null) {
            return false;
        }

        return notaire.getMotDePasse().equals(motDePasse);
    }
}
