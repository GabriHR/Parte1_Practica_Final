package Lab;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    private String nombreArchivo;
    private String descripcion;
    private List<PoblacionBacteria> poblaciones;

    public Experimento(String nombreArchivo, String descripcion) {
        this.nombreArchivo = nombreArchivo;
        this.descripcion = descripcion;
        this.poblaciones = new ArrayList<>();
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void addPoblacion(PoblacionBacteria poblacion) {
        this.poblaciones.add(poblacion);
    }
    public List<PoblacionBacteria> getPoblaciones() {
        return this.poblaciones;
    }
    public void removePoblacion(PoblacionBacteria poblacion) {
        this.poblaciones.remove(poblacion);
    }

}