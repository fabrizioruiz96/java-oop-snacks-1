

public class RegistroStudenti {
    
    private Studente[] registroStudenti;
    private int indexRegistro = 0;

    public RegistroStudenti(int lenghtRegistro){
        registroStudenti = new Studente[lenghtRegistro];
        System.out.println("Il registro è lungo :" + registroStudenti.length);
    }

    public void addStudente(Studente nome){
        registroStudenti[indexRegistro] = nome;
        System.out.println("Lo studente " + nome.getDatiStudente() + " è stato aggiunto all'indice " + indexRegistro);
        indexRegistro++;
        if(indexRegistro == registroStudenti.length){
            System.out.println("Registro completato!");
        }
    }

    public void getListaStudenti(){
        System.out.println("Il registro comprende:");
        for(int i = 0; i < registroStudenti.length; i++){
            System.out.println(registroStudenti[i].getDatiStudente());
        }
    }
}