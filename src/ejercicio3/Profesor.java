package ejercicio3;

public class Profesor extends Libro{
    private String nombre1,materia;
    private int edad1;

    public Profesor(String nombre, int edad, String curso, String titulo, String autor, int paginas, String nombre1, String materia, int edad1) {
        super(nombre, edad, curso, titulo, autor, paginas);
        this.nombre1 = nombre1;
        this.materia = materia;
        this.edad1 = edad1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre) {
        this.nombre1 = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getEdad1() {
        return edad1;
    }

    public void setEdad1(int edad) {
        this.edad1 = edad1;
    }



    @Override
    public String getInfo() {
        return "Libro: "+this.getTitulo()+", Autor: "+this.getAutor()+", Páginas: "+this.getPaginas()
                +"\n"+"Alumno: "+this.getNombre()+", Edad: "+this.getEdad()+", Curso: "+this.getCurso()
                +"\n"+"Profesor: "+this.getNombre1()+", Edad: "+ this.getEdad1()+", Materia: "+this.getMateria();
    }
}
