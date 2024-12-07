public class Umbreon extends Eevee {
    public Umbreon() {
        super("Sombrio", 10, 95, 27.0);
    }

    @Override
    public String ataque() {
        return "Soco Sombrio - Feint Attack";
    }

    @Override
    public String defesa() {
        return "Reflexo Escuro - Moonlight";
    }

    @Override
    public String especial() {
        return "Explosão Sombria - Dark Pulse";
    }
}