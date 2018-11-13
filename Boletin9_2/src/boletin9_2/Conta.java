package boletin9_2;

/**
 *
 * @author rafa
 */
public class Conta {

    public void sumayProducto() {
        double conta;
        double sum = 10;
        double producto = 10;

        for (conta = 11; conta < 90; conta++) {
            sum = sum + conta;
            producto = producto * conta;
        }
        System.out.println("Suma total: " + sum + "\nProducto total: " + producto);
    }
}
