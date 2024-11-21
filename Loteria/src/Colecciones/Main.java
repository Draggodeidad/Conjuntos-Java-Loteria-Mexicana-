package Colecciones;

public class Main {
    public static void main(String[] args) {
        /*
         * final int NUM_BALLS = 75;
         * 
         * ArraySet<BingoBall> bingo = new ArraySet<>();
         * BingoBall ball;
         * 
         * for (int num = 1; num <= NUM_BALLS; num++) {
         * ball = new BingoBall(num);
         * bingo.add(ball);
         * }
         * 
         * System.out.println(bingo);
         * for (int num = 1; num <= NUM_BALLS; num++) {
         * ball = bingo.removeRandom();
         * System.out.println(ball);
         * }
         */

        // Nombres de las cartas de la lotería mexicana
        String[] cardNames = {
                "El Gallo", "El Diablito", "La Dama", "El Catrín", "El Paraguas",
                "La Sirena", "La Escalera", "La Botella", "El Barril", "El Árbol",
                "El Melón", "El Valiente", "El Gorrito", "La Muerte", "La Pera",
                "La Bandera", "El Bandolón", "El Violoncello", "La Garza", "El Pájaro",
                "La Mano", "La Bota", "La Luna", "El Cotorro", "El Borracho",
                "El Negrito", "El Corazón", "La Sandía", "El Tambor", "El Camarón",
                "Las Jaras", "El Músico", "La Araña", "El Soldado", "La Estrella",
                "El Cazo", "El Mundo", "El Apache", "El Nopal", "El Alacrán",
                "La Rosa", "La Calavera", "La Campana", "El Cantarito", "El Venado",
                "El Sol", "La Corona", "La Chalupa", "El Pino", "El Pescado",
                "La Palma", "La Maceta", "El Arpa", "La Rana"
        };

        // Crear conjunto de cartas
        ArraySet<LoteriaCard> loteriaSet = new ArraySet<>();

        // Agregar cartas al conjunto
        for (String cardName : cardNames) {
            loteriaSet.add(new LoteriaCard(cardName));
        }

        // Mostrar todas las cartas
        System.out.println("Todas las cartas de la lotería:");
        System.out.println(loteriaSet);

        // Sacar cartas aleatorias
        System.out.println("\nCartas extraídas de manera aleatoria:");
        while (!loteriaSet.isEmpty()) {
            LoteriaCard randomCard = loteriaSet.removeRandom();
            System.out.println(randomCard);
        }

    }
}
