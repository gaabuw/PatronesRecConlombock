package Builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class Usuario {
    private final String nombre;
    private final String email;
    private final String direccion;
    private final String telefono;
    private final String fechaNacimiento;
}
