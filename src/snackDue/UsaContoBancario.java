package snackDue;

public class UsaContoBancario {
    
    public static void main(String[] args) {
        ContoBancario nuovoContoBancario = new ContoBancario(4435);
        nuovoContoBancario.Saldo();
        nuovoContoBancario.Deposito(500);
        nuovoContoBancario.Saldo();
        nuovoContoBancario.Prelievo(376.46);
        nuovoContoBancario.Saldo();
    }
}
