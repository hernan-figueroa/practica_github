package Entidades;

public class Gato {
    
    private String nombre;
    private String apodo;

    public Gato() {
    }

    public Gato(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", apodo=" + apodo + '}';
    }
    

}