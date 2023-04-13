package facade;

public class Cartorio extends OrganizacaoResponsavel{
    private static Cartorio cartorio = new Cartorio();

    private Cartorio() {};

    public static Cartorio getInstancia() {
        return cartorio;
    }
}
