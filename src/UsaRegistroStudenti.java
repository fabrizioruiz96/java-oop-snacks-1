public class UsaRegistroStudenti {
    
    public static void main(String[] args) {

        Studente Studente1 = new Studente("Fabrizio", "Ruiz", 28);
        Studente Studente2 = new Studente("Sara", "Funari", 25);
        Studente Studente3 = new Studente("Simone", "Cappella", 27);
        Studente Studente4 = new Studente("Giorgia", "Greco", 25);
        Studente Studente5 = new Studente("Davide", "Blaffard", 26);

        RegistroStudenti Studente = new RegistroStudenti();

        Studente.addStudente(Studente1);
        Studente.addStudente(Studente2);
        Studente.addStudente(Studente3);
        Studente.addStudente(Studente4);
        Studente.addStudente(Studente5);
        
        Studente.getListaStudenti();
    }
}