/**
 *
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 20:19
 * @category Model
 */
public class Mes {

    private String nomeMes;

    public Mes() {

    }

    /**
     *
     * @param nomeMes Recebe o nome do mes
     */
    public Mes(String nomeMes)  {
        this.nomeMes = nomeMes;
    }

    public String getNomeMes()  {
        return this.nomeMes;
    }

    public void setNomeMes(String nomeMes)  {
        this.nomeMes = nomeMes;
    }

    /**
     * @return Retorna o trimestre em que a pessoa nasceu, com base no mes
    digitado.
     */
    public String retornarTrimestre() {
        if(this.nomeMes.equalsIgnoreCase("Janeiro")) {
            return "Nasceu no primeiro trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Fevereiro")) {
            return "Nasceu no primeiro trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Março")) {
            return "Nasceu no primeiro trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Abril")) {
            return "Nasceu no segundo trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Maio")) {
            return "Nasceu no segundo trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Junho")) {
            return "Nasceu no segundo trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Julho")) {
            return "Nasceu no terceiro trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Agosto")) {
            return "Nasceu no terceiro trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Setembro")) {
            return "Nasceu no terceiro trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Outubro")) {
            return "Nasceu no quarto trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Novembro")) {
            return "Nasceu no quarto trimestre do ano.";
        } else if(this.nomeMes.equalsIgnoreCase("Dezembro")) {
            return "Nasceu no quarto trimestre do ano.";
        } {
            return "Mes invalido.";
        }
    }

    @Override
    public String toString() {
        return "\nMês digitado: " + this.nomeMes
              +"\nTrimestre correspondente: " + this.retornarTrimestre()
                ;

    }
}
