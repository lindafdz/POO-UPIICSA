public class Persona {
    public String cedula;
    public String nombre;
    public String apellido;
    public char sexo;
    public int edad;

    public Persona() {
        this.cedula = ".....";
        this.nombre = ".....";
        this.apellido = ".....";
        this.sexo = '-';
        this.edad = 0;
    }

    // Parámetros
    public Persona (String ced, String nom, String ape, char sex, int edad){
        this.cedula = ced;
        this.nombre = nom;
        this.apellido = ape;
        this.sexo = sex;
        this.edad = edad;
    }

    // Constructor copia
    public Persona(Persona p) {
        this.cedula = p.cedula;
        this.nombre = p.nombre;
        this.apellido = p.apellido;
        this.sexo = p.sexo;
        this.edad = p.edad;
    }

    // Metodo personalizado de una clase
    public String toString() {
        return " " + cedula + "\t" + nombre + "\t" + apellido + "\t" + sexo + "\t" + edad + "\n";
    }
}