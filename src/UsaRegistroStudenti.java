public class UsaRegistroStudenti {
    
    public static void main(String[] args) {

        RegistroStudenti Studente = new RegistroStudenti(5);

        Studente studente1 = new Studente("Fabrizio", "Ruiz", 28);
        Studente studente2 = new Studente("Sara", "Funari", 25);
        Studente studente3 = new Studente("Simone", "Cappella", 27);
        Studente studente4 = new Studente("Giorgia", "Greco", 25);
        Studente studente5 = new Studente("Davide", "Blaffard", 26);


        Studente.addStudente(studente1);
        Studente.addStudente(studente2);
        Studente.addStudente(studente3);
        Studente.addStudente(studente4);
        Studente.addStudente(studente5);
        
        Studente.getListaStudenti();
    }
}