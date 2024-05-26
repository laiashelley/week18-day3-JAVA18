public class ClienteDiscoteca {
    
    private String nombre;
    private int edad;

    public ClienteDiscoteca() {
    }

    public ClienteDiscoteca(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "; " +
            "Edad: " + getEdad();
    }

}
