package rencontres;

/**
 * Classe fille de Rencontre, prend un constructeur Monstre qui prend en parametre le type de Rencontre
 * Ici, j'ai decider d'utiliser typeRencontre dans les 2 sous-class Monstre et Tresor, a la palce d'utiliser
 * typeMonstre ou typeTresor par ce que au final ca reste une rencontre, et ca nous evite la repetition.
 */
public class Monstre extends Rencontre {
    /**
     * Constructeur qui permet d'initialiser un type de Monstre (Gobelin, Orque ou Gargouille)
     * @param typeRencontre
     */
    public Monstre(String typeRencontre){
        super(typeRencontre);

    }

    /**
     * Methode Rencontrer propre a Monstre
     * @return Genere un message generique pour tout les Monstres (Sauf le Boss qui a sa propre methode)
     */
    @Override
    public String Rencontrer() {
        return "Un " + getTypeRencontre() + " affreux!";
    }
}