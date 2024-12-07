public class Sylveon extends Eevee {
    public Sylveon() {
        super("Fada", 10, 95, 23.5);
    }

    @Override
    public String ataque() {
        return "Beijo Drenante - Draining Kiss";
    }

    @Override
    public String defesa() {
        return "Aura de Luz - Misty Terrain";
    }

    @Override
    public String especial() {
        return "Explosão Lunar - Moonblast";
    }
}