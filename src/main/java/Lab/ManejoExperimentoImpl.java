package Lab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManejoExperimentoImpl implements ManejoExperimento {
    private List<Experimento> experiments;

    public ManejoExperimentoImpl() {
        experiments = new ArrayList<>();
    }

    public List<Experimento> getExperiments() {
        return this.experiments;
    }

    public void saveExperiment(Experimento experiment) {
        this.experiments.add(experiment);
    }

    public void saveExperimentAs(String name, String description) {
        Experimento experiment = new Experimento(name, description);
        this.experiments.add(experiment);
    }

    public Optional<Experimento> getExperimentByName(String name) { // Cambiado a public
        return experiments.stream()
                .filter(experiment -> experiment.getNombreArchivo().equals(name))
                .findFirst();
    }

    public Experimento loadExperiment(String name) throws IOException {
        Optional<Experimento> optionalExperiment = getExperimentByName(name);
        if (optionalExperiment.isPresent()) {
            return optionalExperiment.get();
        } else {
            throw new IOException("Experimento no encontrado");
        }
    }
}