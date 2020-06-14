import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author  Daniel Teles
 * @version 1.0
 * @since 01/06/2020 - 20:25
 * @category Test
 */
class MesTest {

    Mes mes = new Mes();

    @org.junit.jupiter.api.Test
    void retornarTrimestre() {
    }

    /**
     * Testa o metodo retornarTrimestre()
     */
    public void testarRetornarTrimestre() {
        mes.setNomeMes("Janeiro");
        assertEquals("Nasceu no primeiro trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Fevereiro");
        assertEquals("Nasceu no primeiro trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Março");
        assertEquals("Nasceu no primeiro trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Abril");
        assertEquals("Nasceu no segundo trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Maio");
        assertEquals("Nasceu no segundo trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Junho");
        assertEquals("Nasceu no segundo trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Julho");
        assertEquals("Nasceu no terceiro trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Agosto");
        assertEquals("Nasceu no terceiro trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Setembro");
        assertEquals("Nasceu no terceiro trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Outubro");
        assertEquals("Nasceu no quarto trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Novembro");
        assertEquals("Nasceu no quarto trimestre do ano.",
                mes.retornarTrimestre());

        mes.setNomeMes("Dezembro");
        assertEquals("Nasceu no quarto trimestre do ano.",
                mes.retornarTrimestre());
    }

    /**
     * Testa o metodo toString()
     */
    @Test
    public void testarToString() {
        mes.setNomeMes("Janeiro");
        assertEquals("\nMês digitado: Janeiro\nTrimestre correspondente: Nasceu no primeiro trimestre do ano.", mes.toString());
    }
}