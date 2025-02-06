public class ContoBancario {
    
    private int numeroConto;
    private double saldoConto;

    public ContoBancario(int numeroConto){
        if(numeroConto != 0){
            this.numeroConto = numeroConto;
        } else{
            System.out.println("Numero Conto non valido!");
        }
        saldoConto = 0;
    }

    public void deposito(double soldi){
        saldoConto += soldi;
        System.out.format("Hai depositato EURO %f\n", soldi);
    }

    public void prelievo(double soldi){
        saldoConto -= soldi;
        System.out.format("Hai prelevato EURO %f\n", soldi);
    }

    public double saldo(){
        System.out.format("Il tuo saldo corrente è di EURO %f\n", saldoConto);
        return saldoConto;
    }
}