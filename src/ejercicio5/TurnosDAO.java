package ejercicio5;

import java.util.ArrayList;

public class TurnosDAO {
    private ArrayList<TurnoABS> turnos;

    public TurnosDAO() {
        turnos = new ArrayList<>();
    }

    public void addTurno(TurnoABS turno) {
        turnos.add(turno);
    }

    public ArrayList<TurnoABS> getTurnos() {
        return turnos;
    }
}
