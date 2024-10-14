package rencontres;

/**
 * Sous-Class Boss qui herite de Gargouille, et appel le constructeur Gargouille.
 * Ici, je met explicitement le type de rencontre a Boss, meme si en realiter c'est un type de Gargouille.
 */
public class Boss extends Gargouille{
    public Boss() {
        super();
        this.setTypeRencontre("Boss");
    }

    /**
     * Methode Rencontrer special au Boss
     * @return Retourne un String "La batailel finale!"
     */
    @Override
    public String Rencontrer() {
        return "La bataille finale!";
    }
}
