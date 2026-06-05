package ejercicio2;

import java.util.Objects;

public class Participante {

    private String idJugador;
    private String nombre;
    private String categoria;

    public Participante(String idJugador, String nombre, String categoria) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return idJugador + " - " + nombre + " - " + categoria;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof Participante))
            return false;

        Participante that = (Participante) o;

        return Objects.equals(idJugador, that.idJugador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJugador);
    }
}