package Lab;

import java.io.Serializable;
import java.util.Date;

public class PoblacionBacteria implements Serializable {
    private String nombre;
    private Date startDate;
    private Date endDate;
    private int initialBacteriaCount;
    private double temp;
    private String condicionesLuminosidad;
    private OrganizacionComida organizacionComida;

    public PoblacionBacteria (String nombre, Date startDate, Date endDate, int initialBacteriaCount, double temp, String condicionesLuminosidad, OrganizacionComida organizacionComida) {
        this.nombre = nombre;
        this.startDate = startDate;
        this.endDate = endDate;
        this.initialBacteriaCount = initialBacteriaCount;
        this.temp = temp;
        this.condicionesLuminosidad = condicionesLuminosidad;
        this.organizacionComida = organizacionComida;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getInitialBacteriaCount() {
        return initialBacteriaCount;
    }

    public double getTemp() {
        return temp;
    }

    public String getCondicionesLuminosidad() {
        return condicionesLuminosidad;
    }

    public OrganizacionComida getOrganizacionComida() {
        return organizacionComida;
    }
}