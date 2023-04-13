package facade;

public class Seguradora extends OrganizacaoResponsavel{
    private static Seguradora seguradora = new Seguradora();

    private Seguradora() {};

    public static Seguradora getInstancia() {
        return seguradora;
    }
}
