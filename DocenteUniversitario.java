
package esercizi.esercizio10;


public class DocenteUniversitario extends Persona{
    
    private String materia;
    private String facolta;

    public DocenteUniversitario(String materia, String facolta, String nome, String cognome, String codiceFiscale) {
        super(nome, cognome, codiceFiscale);
        this.materia = materia;
        this.facolta = facolta;
    }
    
    public DocenteUniversitario() {
        super("", "", "");
        this.materia = "";
        this.facolta = "";
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFacolta() {
        return facolta;
    }

    public void setFacolta(String facolta) {
        this.facolta = facolta;
    }
    
    
}
