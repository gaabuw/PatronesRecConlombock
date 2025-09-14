package Prototype;

import Builder.Usuario;
import Factory.Librito;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Prestamo implements Cloneable {
    private Librito libro;
    private Usuario usuario;
    private String fechaInicio;
    private String fechaFin;

    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el préstamo", e);
        }
    }
}
