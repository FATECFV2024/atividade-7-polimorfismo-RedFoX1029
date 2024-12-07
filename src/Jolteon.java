public class Jolteon extends Eevee{

    public Jolteon() {
        super("Elétrico", 8, 65, 24.5);
    }

    @Override
    public String ataque() {
        return "Trovoada - Thunder-Shock";
    }
    @Override
    public String defesa() {
        return "Carga - Wild Charge";
    }
    @Override
    public String especial() {
        return "Raio - Thunder";
    }
}
