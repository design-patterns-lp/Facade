package facade;

public class Locatario {
    public boolean alugar(){
        return LocatarioFacade.verificarPendenciasLocacao(this);
    }
}