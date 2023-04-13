package facade;

import java.util.ArrayList;
import java.util.List;

public class OrganizacaoResponsavel {
    private List<Locatario> locatariosComPendencia = new ArrayList<Locatario>();

    public void addLocatarioPendente(Locatario locatario){
        this.locatariosComPendencia.add(locatario);
    }

    public boolean verificarLocatarioComPendencia(Locatario locatario){
        return this.locatariosComPendencia.contains(locatario);
    }
    
}
