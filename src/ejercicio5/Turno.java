package ejercicio5;

public class Turno {
    private int horaInicio;
    private int horaFin;
    private String descripcion;

    public Turno(int horaInicio, int horaFin, String descripcion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
