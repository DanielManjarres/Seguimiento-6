package ejercicio3;

public abstract class Libro extends Alumno {
    private String titulo,autor;
    private int paginas;

    public Libro(String nombre, int edad, String curso,String titulo,String autor,int paginas ) {
        super(nombre,edad,curso);
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public java.lang.String getTitulo() {

        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {

        this.titulo = titulo;
    }

    public java.lang.String getAutor() {

        return autor;
    }

    public void setAutor(java.lang.String autor) {

        this.autor = autor;
    }

    public int getPaginas() {

        return paginas;
    }

    public void setPaginas(int paginas) {

        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
