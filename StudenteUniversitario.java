
package esercizi.esercizio10;


public class StudenteUniversitario extends Persona{
    
    private int matricola;
    private int esami;

    public StudenteUniversitario(int matricola, int esami, String nome, String cognome, String codiceFiscale) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
        this.esami = esami;
    }
    
    public StudenteUniversitario() {
        super("", "", "");
        this.matricola = 0;
        this.esami = 0;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public int getEsami() {
        return esami;
    }

    public void setEsami(int esami) {
        this.esami = esami;
    }
    
    
    
}
