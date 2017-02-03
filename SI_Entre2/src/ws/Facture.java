package ws;

public class Facture {
    private int code;
    private String nom;
    private float montant;
    
    public Facture(){
        super();
    }
    
    public Facture(int code, String nom, float montant){
        this.code=code;
        this.nom=nom;
        this.montant=montant;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}
