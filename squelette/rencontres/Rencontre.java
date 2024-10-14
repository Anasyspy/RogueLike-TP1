package rencontres;

import code_squelette.RencontreType;

/**
 * Classe abstraite Rencontre, qui possede la methode rencontrer qui sera propre a chacune des sous classes.
 * Attribu typeRencontre: Retourne le type de rencontre (Gobelin,Orque,Gargouille,Boss,Sac,Potion,Artefacte..)
 * Methode abstraite rencontrer, qui sera propre a chaque sous-classe.
 */
public abstract class Rencontre {

    private String typeRencontre;

    public Rencontre(String typeRencontre) {
        this.typeRencontre = typeRencontre;
    }

    /**
     * Getter pour avoir le Type de Rencontre
     * @return Nous retourne le type
     */
    public String getTypeRencontre() {
        return typeRencontre;
    }

    /**
     * Setter pour modifier/set un type de rencontre
     * @param typeRencontre : Definir le type de rencontre qu'on veut
     */
    public void setTypeRencontre(String typeRencontre) {
        this.typeRencontre = typeRencontre;
    }

    public abstract String Rencontrer(); //Methode abstraite qui sera appeler dans les sous-classes
}
