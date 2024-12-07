public class Flareon extends Eevee {
    public Flareon() {
        super("Fogo", 9, 65, 25.0);
    }

    @Override
    public String ataque() {
        return "Chama - Ember";
    }

    @Override
    public String defesa() {
        return "Carga de Fogo - Flame Charge";
    }

    @Override
    public String especial() {
        return "Explosão de Fogo - Fire Blast";
    }
}