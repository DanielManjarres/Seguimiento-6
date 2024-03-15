package ejercicio1;

public interface IEjer1 {
    void saveEmpleado(Empleado empleado);
    void visualizarInformacion(Empleado empleado);
    void ModificarSalario(Empleado empleado, double nuevoSalario);
    int calcularEdad(Empleado empleado);
    int calcularAntiguedad(Empleado empleado);
    double calcularPrestaciones(Empleado empleado);
    void modificarSalario(Empleado empleado, double nuevoSalario);
}
