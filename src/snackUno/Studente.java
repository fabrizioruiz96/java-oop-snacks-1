package snackUno;

public class Studente {

    private String nome;
    private String cognome;
    private int anni;

    public Studente(String nome, String cognome, int anni){
        if(nome != null){
            this.nome = nome;
        } else{
            System.out.println("Impossibile accettare nome vuoto!");
        }
        if(cognome != null){
            this.cognome = cognome;
        } else{
            System.out.println("Impossibile accettare cognome vuoto!");
        }
        if(anni >= 6){
            this.anni = anni;
        } else{
            System.out.println("Impossibile accettare età inferiore a 6!");
        }
    }

    public String getDatiStudente(){
        String datiStudente = nome + " " + cognome + ", " + anni + " anni";
        System.out.println(datiStudente);
        return datiStudente;
    }
}
