package Factory;

import lombok.ToString;

@ToString(callSuper = true)
public class LibroFisico extends Libro {
    public LibroFisico(String titulo, String autor, String isbn) {
        super(titulo, autor, isbn);
    }

    @Override
    public String getTipo() {
        return "Libro Físico";
    }
}

