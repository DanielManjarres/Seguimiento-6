package ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Profesor p = new Profesor("Daniel",16,"Decimo","Algebra","Baldor",260,"Julio","Matematicas",32);
        ArrayList<Profesor>Information = new ArrayList<Profesor>();
        Information.add(p);
        System.out.println(p.getInfo());
}
}
