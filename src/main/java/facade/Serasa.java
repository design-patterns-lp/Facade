package facade;

public class Serasa extends OrganizacaoResponsavel{
    private static Serasa serasa = new Serasa();

    private Serasa() {};

    public static Serasa getInstancia() {
        return serasa;
    }
    
}
