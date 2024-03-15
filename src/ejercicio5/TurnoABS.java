package ejercicio5;

public class TurnoABS implements TurnoInt{
    private String horaInicio;
    private String horaFin;
    private String descripcion;

    public TurnoABS(String horaInicio, String horaFin, String descripcion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {

    }

    @Override
    public String getHoraInicio() {
        return horaInicio;
    }

    @Override
    public String getHoraFin() {
        return horaFin;
    }
    public String toString() {
        return "Turno: " + descripcion;
    }
}
