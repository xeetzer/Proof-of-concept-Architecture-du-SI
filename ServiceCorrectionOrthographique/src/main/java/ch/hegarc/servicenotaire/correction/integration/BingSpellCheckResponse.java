package ch.hegarc.servicenotaire.correction.integration;

import java.util.List;

public class BingSpellCheckResponse {
    public String _type;
    public String correctionType;
    public List<FlaggedTokens> flaggedTokens;

    public BingSpellCheckResponse() {
    }

    @Override
    public String toString() {
        return "BingSpellCheckResponse{" +
                "_type='" + _type + '\'' +
                ", correctionType='" + correctionType + '\'' +
                ", flaggedTokens=" + flaggedTokens +
                '}';
    }
}
