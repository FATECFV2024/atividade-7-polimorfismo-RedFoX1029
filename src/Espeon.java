public class Espeon extends Eevee {
    public Espeon() {
        super("Psíquico", 9, 65, 26.5);
    }

    @Override
    public String ataque() {
        return "Confusão - Confusion";
    }

    @Override
    public String defesa() {
        return "Barreira Psíquica - Light Screen";
    }

    @Override
    public String especial() {
        return "Psíquico - Psychic";
    }
}