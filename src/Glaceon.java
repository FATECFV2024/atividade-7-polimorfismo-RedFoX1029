public class Glaceon extends Eevee {
    public Glaceon() {
        super("Gelo", 8, 65, 25.9);
    }

    @Override
    public String ataque() {
        return "Granizo Gelado - Ice Shard";
    }

    @Override
    public String defesa() {
        return "Barreira de Gelo - Barrier";
    }

    @Override
    public String especial() {
        return "Nevasca - Blizzard";
    }
}