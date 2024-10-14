package rencontres;

public class Boss extends Gargouille{
    public Boss() {
        super();
    }
// On Override pour definir le message special pour le Boss.
    @Override
    public String Rencontrer() {
        return "La bataille finale!";
    }
}
