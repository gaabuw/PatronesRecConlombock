package Abstract_Factory;

public class EnvioNormal implements MetodoEnvio {
    @Override
    public void enviar() {
        System.out.println("Enviando por método normal (3-5 días).");
    }
}
