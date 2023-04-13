package facade;

public class LocatarioFacade {
    public static boolean verificarPendenciasLocacao(Locatario locatario){

        if(Serasa.getInstancia().verificarLocatarioComPendencia(locatario)){
            return false;
        }
        if(Cartorio.getInstancia().verificarLocatarioComPendencia(locatario)){
            return false;
        }
        if(Seguradora.getInstancia().verificarLocatarioComPendencia(locatario)){
            return false;
        }
        return true;
    }
}
