
import java.util.Scanner;

public class RegistroStudenti {
    
    private Studente[] RegistroStudenti;
    private int indexRegistro;

    public RegistroStudenti(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanti alunni ci sono in classe?");
        RegistroStudenti = new Studente[scan.nextInt()];
        System.out.println("Il registro è lungo :" + RegistroStudenti.length);
        System.out.println("L'indice al registro è " + indexRegistro);
    }

    public void addStudente(Studente nome){
        RegistroStudenti[indexRegistro] = nome;
        System.out.println("Lo studente " + nome.getDatiStudente() + " è stato aggiunto all'indice " + indexRegistro);
        indexRegistro++;
        if(indexRegistro < RegistroStudenti.length){
            System.out.println("Il nuovo indice da riempire è " + indexRegistro);
        } else{
            System.out.println("Registro completato!");
        }
    }

    public void getListaStudenti(){
        for(int i = 0; i < RegistroStudenti.length; i++){
            System.out.println(RegistroStudenti[i].getDatiStudente());
        }
    }
}