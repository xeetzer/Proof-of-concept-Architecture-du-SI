package ch.hegarc.servicenotaire.correction.integration;

import java.util.List;

public class TextGearsGrammarCheckError {
    public String id;
    public int offset;
    public int length;
    public String bad;
    public List<String> better;
    public String type;
}
