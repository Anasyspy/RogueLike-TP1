package rencontres;

public class Monstre extends Rencontre {

    public Monstre(String typeRencontre){
        super(typeRencontre);

    }
    @Override
    public String Rencontrer() {
        return "Un " + getTypeRencontre() + " affreux!";
    }
}