package ch.hegarc.servicenotaire.correction.service;

import java.io.IOException;

public interface ICorrectionService {
    String correction(String textACorriger) throws IOException;
}
