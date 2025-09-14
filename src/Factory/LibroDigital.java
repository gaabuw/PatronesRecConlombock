package Factory;

import lombok.ToString;

@ToString(callSuper = true)
public class LibroDigital extends Libro {
    public LibroDigital(String titulo, String autor, String isbn) {
        super(titulo, autor, isbn);
    }

    @Override
    public String getTipo() {
        return "Libro Digital";
    }
}
