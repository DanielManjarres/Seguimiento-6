package ejercicio5;
import javax.swing.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            TurnosDAO turnoDAO = new TurnosDAO();
            String opcion = "";
            Scanner scanner = new Scanner(System.in);

            while (!opcion.equalsIgnoreCase("n")) {
                System.out.println("¿Desea agregar un turno? (s/n)");
                opcion = scanner.nextLine();
                if (opcion.equalsIgnoreCase("s")) {
                    System.out.println("Ingrese la hora de inicio del turno:");
                    String horaInicio = scanner.nextLine();
                    System.out.println("Ingrese la hora de fin del turno:");
                    String horaFin = scanner.nextLine();
                    System.out.println("Ingrese la descripción del turno:");
                    String descripcion = scanner.nextLine();

                    turnoDAO.addTurno(new TurnoABS(horaInicio, horaFin, descripcion));
                }
            }

            StringBuilder sb = new StringBuilder();
            for (TurnoABS turno : turnoDAO.getTurnos()) {
                sb.append(turno.toString()).append("\n");
            }

            JOptionPane.showMessageDialog(null, sb.toString(), "Turnos", JOptionPane.INFORMATION_MESSAGE);
        }
}
