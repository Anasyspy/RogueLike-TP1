package rencontres;

/**
 * Sous-Class Rien qui herite de Rencontre, et appel le constructeur Rencontre avec le type de rencontre: Rien
 */
public class Rien extends Rencontre{
    public Rien(String typeRencontre) {
        super("Rien");
    }

    /**
     * Methode Rencontrer, propre a Rien pour afficher un message special
     * @return Retourne un String propre a la class Rien "Un moment pacifique"
     */
    @Override
    public String Rencontrer() {
        return "Un moment pacifique.";
    }
}
