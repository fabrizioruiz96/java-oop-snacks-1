public class UsaContoBancario {
    
    public static void main(String[] args) {
        ContoBancario nuovoContoBancario = new ContoBancario(4435);
        nuovoContoBancario.saldo();
        nuovoContoBancario.deposito(500);
        nuovoContoBancario.saldo();
        nuovoContoBancario.prelievo(376.46);
        nuovoContoBancario.saldo();
    }
}