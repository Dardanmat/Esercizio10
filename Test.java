
package esercizi.esercizio10;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test {
    
    public static void main(String[] args){
        
        //CREAZIONE OGGETTI DOCENTE
        ArrayList<DocenteUniversitario> docenti = new ArrayList<>();
        
        DocenteUniversitario do1 = new DocenteUniversitario();
        DocenteUniversitario do2 = new DocenteUniversitario();
        DocenteUniversitario do3 = new DocenteUniversitario();
        
        docenti.add(do1);
        docenti.add(do2);
        docenti.add(do3);
        
        //CREAZIONE OGGETTI STUDENTIE
        ArrayList<StudenteUniversitario> studenti = new ArrayList<>();
        
        StudenteUniversitario st1 = new StudenteUniversitario();
        StudenteUniversitario st2 = new StudenteUniversitario();
        StudenteUniversitario st3 = new StudenteUniversitario();

        studenti.add(st1);
        studenti.add(st2);
        studenti.add(st3);
        
        //CODICE PER L'INPUT
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        //INSERIMENTO DATI STUDENTI
        
        for(int i = 0; i < studenti.size(); i++){              
            try{   
                System.out.println(i+1 + ". Inserire il nome: ");
                studenti.get(i).setNome(tastiera.readLine());

                System.out.println(i+1 + ". Inserire il cognome: ");
                studenti.get(i).setCognome(tastiera.readLine());

                System.out.println(i+1 + ". Inserire il codice fiscale: ");
                studenti.get(i).setCodiceFiscale(tastiera.readLine());
                
                System.out.println(i+1 + ". Inserire il numero esami svolti: ");
                studenti.get(i).setEsami(Integer.valueOf(tastiera.readLine()).intValue());
                
                System.out.println(i+1 + ". Inserire la matricola: ");
                studenti.get(i).setMatricola(Integer.valueOf(tastiera.readLine()).intValue());
            
            } catch (Exception e) {
                System.out.println("Errore: "+ e.getMessage());
                i--;
            } 
        }
        
        
        //INSERIMENTO DATI DOCENTI
        for(int i = 0; i < docenti.size(); i++){  
            try{                   
                System.out.println(i+1 + ". Inserire il nome del docente: ");
                docenti.get(i).setNome(tastiera.readLine());

                System.out.println(i+1 + ". Inserire il cognome del docente: ");
                docenti.get(i).setCognome(tastiera.readLine());

                System.out.println(i+1 + ". Inserire il codice fiscale: ");
                docenti.get(i).setCodiceFiscale(tastiera.readLine());
                
                System.out.println(i+1 + ". Inserire la materia del docente: ");
                docenti.get(i).setMateria(tastiera.readLine());
                
                System.out.println(i+1 + ". Inserire la facolta del docente: ");
                docenti.get(i).setFacolta(tastiera.readLine());
            
            } catch (Exception e) {
                System.out.println(i+1 + ". Errore: "+ e.getMessage());
                i--;
            }
        }
        
//        - Stampare in output l’elenco di tutti gli studenti e dei rispettivi esami sostenuti.
//        (Es. Giuseppe Verdi ha sostenuto 10 esami.)
//        - Stampare in output tutti gli studenti il cui cognome inizia per una lettera chiesta in input all'utente.
//        - Stampare in output l’elenco dei docenti e la facoltà di appartenenza.
        
        System.out.println("\n\n");

        for(int i = 0; i < studenti.size(); i++){
            
            System.out.println(i+1 + ". " + studenti.get(i).getNome() + " " + studenti.get(i).getCognome() + ": " + studenti.get(i).getEsami() + " esami sostenuti");
            
        }
        
        String c = "";
        do{
            try{
            
            System.out.println("Inserire la lettera per cercare gli studenti");
            c = tastiera.readLine();
            
            }catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }

	    if(c.length() != 1){ System.out.println("Errore: è consentito inserire un solo carattere");}
			
            
        }while(c.length() != 1);

        for(int i = 0; i < studenti.size(); i++){
            
            if(studenti.get(i).getCognome().startsWith(c)){
                
                System.out.println(studenti.get(i).getNome() + " " + studenti.get(i).getCognome());
                
            }
            
        }
        
        System.out.println("\n\n");
        for(int i = 0; i < docenti.size(); i++){
            
            System.out.println(i+1 + ". " + docenti.get(i).getNome() + " " + docenti.get(i).getCognome() + ": " + docenti.get(i).getFacolta());
            
        }

    }
    
}
