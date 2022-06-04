
    public class Main {
        public static void main(String[] args) {
            // Ingredients
            Ore ore = new Ore(10, false);
            Flower flower = new Flower(9);

            // Elixir
            Elixir elixir = new Elixir("Pierwszy Elixir");
            elixir.addIngredient(ore);
            elixir.addIngredient(flower);

            System.out.println(ore.getMetallic());
            System.out.println(ore.getReagent());
            System.out.println(ore.getPower());
            System.out.println(flower.getToxicity());
        }
    }
