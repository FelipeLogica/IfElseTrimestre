import java.util.Scanner;

/**
 *
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 20:39
 * @category View
 */
public class principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "\f");

        System.out.println("Digite o mes de seu aniverssário: ");
        String nomeMes = scanner.nextLine();

        Mes mes = new Mes(nomeMes);

        System.out.println(mes);

    }
}
