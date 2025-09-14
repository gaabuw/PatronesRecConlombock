package Factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Libro implements Librito {
    private String titulo;
    private String autor;
    private String isbn;
}
