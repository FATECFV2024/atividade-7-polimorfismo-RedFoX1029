public class Pokedex {

    public static void main(String[] args) throws Exception{
        Eevee e = new Eevee("Normal", 8, 55, 6.5);
        Glaceon g = new Glaceon();
        Leafeon l = new Leafeon();
        Vaporeon v = new Vaporeon();
        Flareon f = new Flareon();
        Jolteon j = new Jolteon();
        Espeon es = new Espeon();
        Umbreon u = new Umbreon();
        Sylveon s = new Sylveon();

        imprimir("Eevee", e);
        imprimir("Glaceon", g);
        imprimir("Leafeon", l);
        imprimir("Vaporeon", v);
        imprimir("Flareon", f);
        imprimir("Jolteon", j);
        imprimir("Espeon", es);
        imprimir("Umbreon", u);
        imprimir("Sylveon", s);
    }
    public static void imprimir(String nome, Eevee pokemon) {
        System.out.println("Eu sou " + nome);
        System.out.println("Sou um pokemon do tipo: " + pokemon.getTipo());
        System.out.println("Altura: " + pokemon.getAltura() + " dm");
        System.out.println("Peso: " + pokemon.getPeso() + " kg");
        System.out.println("HP: " + pokemon.getHP());
        System.out.println("Ataque: " + pokemon.ataque());
        System.out.println("Defesa: " + pokemon.defesa());
        System.out.println("Especial: " + pokemon.especial());
        System.out.println(" ");
    }
}
