public class Vaporeon extends Eevee {
    public Vaporeon() {
        super("Água", 10, 130, 29.0);
    }

    @Override
    public String ataque() {
        return "Jato d'Água - Water Gun";
    }

    @Override
    public String defesa() {
        return "Aqua Arco - Aqua Ring";
    }

    @Override
    public String especial() {
        return "Hidrobomba - Hydro Pump";
    }
}
