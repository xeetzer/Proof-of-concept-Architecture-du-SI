package ch.hegarc.servicenotaire.correction.integration;

public class FlaggedTokens {
    public int offset;
    public String token;

    public FlaggedTokens() {
    }

    @Override
    public String toString() {
        return "FlaggedTokens{" +
                "offset=" + offset +
                ", token='" + token + '\'' +
                '}';
    }
}
