public class TravailEtudiant extends Document{

    private Etudiant etudiant;
    
    public TravailEtudiant(Etudiant etu, String contenu){
        super(contenu);
        this.etudiant = etu;
    }


    public String getContenu(){
        return this.contenu;
    }

    public void setContenu(String c){
        this.contenu = c;
    }

    public Etudiant getEtu(){
        return this.etudiant;
    }

    public void setEtu(Etudiant e){
        this.etudiant = e;
    }
}
