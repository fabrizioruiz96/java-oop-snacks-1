package snackDue;

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

    public void Deposito(double soldi){
        saldoConto += soldi;
        System.out.format("Hai depositato EURO %f", soldi);
    }

    public void Prelievo(double soldi){
        saldoConto -= soldi;
        System.out.format("Hai prelevato EURO %f", soldi);
    }

    public double Saldo(){
        System.out.format("Il tuo saldo corrente è di EURO %f", saldoConto);
        return saldoConto;
    }
}
