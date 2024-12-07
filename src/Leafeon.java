public class Leafeon extends Eevee {
    public Leafeon() {
        super("Grama", 10, 65, 25.5);
    }

    @Override
    public String ataque() {
        return "Lâmina de Folha - Razor Leaf";
    }

    @Override
    public String defesa() {
        return "Síntese - Synthesis";
    }

    @Override
    public String especial() {
        return "Tempestade de Folhas - Leaf Storm";
    }
}