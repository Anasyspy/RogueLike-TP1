package rencontres;

/**
 * Classe fille de Rencontre, prend un constructeur Tresor qui prend en parametre le type de Rencontre
 */
public class Tresor extends Rencontre{

    public Tresor(String typeRencontre) {
        super(typeRencontre);
    }

    /**
     * Methode Rencontrer propre a Tresor qui affiche un message
     * @return Affiche un message a chaque class qui herite de Tresor (Potion, SacDeButin, Tresor)
     */
    @Override
    public String Rencontrer(){
        return getTypeRencontre() + "! Quelle chance!";
    }
}
