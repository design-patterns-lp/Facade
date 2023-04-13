package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocatarioTest {

    @Test
    void deveRetornaPendenciaCartorioLocacao(){
        Locatario locatario = new Locatario();
        Cartorio.getInstancia().addLocatarioPendente(locatario);

        assertEquals(false, locatario.alugar());
    }
    @Test
    void deveRetornaPendenciaSeguradoraLocacao(){
        Locatario locatario = new Locatario();
        Seguradora.getInstancia().addLocatarioPendente(locatario);

        assertEquals(false, locatario.alugar());
    }
    @Test
    void deveRetornaPendenciaSerasaLocacao(){
        Locatario locatario = new Locatario();
        Serasa.getInstancia().addLocatarioPendente(locatario);

        assertEquals(false, locatario.alugar());
    }
    @Test
    void deveRetornarLocatarioSemPendenciaLocacao(){
        Locatario locatario = new Locatario();

        assertEquals(true, locatario.alugar());
    }

}
