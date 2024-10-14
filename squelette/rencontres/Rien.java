package rencontres;

public class Rien extends Rencontre{
    public Rien(String typeRencontre) {
        super("Rien");
    }

    @Override
    public String Rencontrer() {
        return "Un moment pacifique.";
    }
}
