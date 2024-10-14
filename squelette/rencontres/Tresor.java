package rencontres;

public class Tresor extends Rencontre{

    public Tresor(String typeRencontre) {
        super(typeRencontre);
    }

    @Override
    public String Rencontrer(){
        return getTypeRencontre() + "! Quelle chance!";
    }
}
