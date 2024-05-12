package Lab;

import java.io.IOException;
import java.util.List;

public interface ManejoExperimento {
    void saveExperiment(Experimento experiment);
    void saveExperimentAs(String currentFileName, String newFileName);
    Experimento loadExperiment(String fileName) throws IOException; // Añade 'throws IOException' aquí
    List<Experimento> getExperiments();
}