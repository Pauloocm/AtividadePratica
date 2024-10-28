import java.util.Random;

public class Corrida {
    private int velocidade;
    private int distanciaPercorrida;

    private int linhaDeChegada = 20;
    private int contadorSimulacao = 1;

    public void SimularCorrida(Veiculo veiculo1, Veiculo veiculo2) {
        do {
            System.out.println("Simulacao " + contadorSimulacao);

            var novaVelocidadeCarro1 = new Random().nextInt(1, 4);
            var novaVelocidadeCarro2 = new Random().nextInt(1, 4);

            veiculo1.setVelocidade(novaVelocidadeCarro1);
            veiculo2.setVelocidade(novaVelocidadeCarro2);

            MostrarCaminhoPercorrido(veiculo1, veiculo2);
            VerificarGanhador(veiculo1, veiculo2);
            contadorSimulacao++;
        } while (veiculo1.getDistanciaPercorrida() < linhaDeChegada && veiculo2.getDistanciaPercorrida() < linhaDeChegada);
    }

    public void MostrarCaminhoPercorrido(Veiculo veiculo1, Veiculo veiculo2) {

        for (int i = 0; i < veiculo1.getDistanciaPercorrida(); i++) {
            System.out.print("_");
        }
        System.out.print("#");

        System.out.print("\n");

        for (int i = 0; i < veiculo2.getDistanciaPercorrida(); i++) {
            System.out.print("_");
        }
        System.out.print("#");

        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
    }

    private void VerificarGanhador(Veiculo veiculo1, Veiculo veiculo2) {

        if ((veiculo1.getDistanciaPercorrida() >= linhaDeChegada
                && veiculo2.getDistanciaPercorrida() >= linhaDeChegada) &&
                veiculo1.getDistanciaPercorrida() == veiculo2.getDistanciaPercorrida()) {
            System.out.println(" ---- IMPATE ---- ");
            System.out.println(" ---- Os dois VEICULOS cruzaram a linha de chegada ao mesmo tempo ---- ");
        } else if (veiculo1.getDistanciaPercorrida() >= linhaDeChegada && veiculo2.getDistanciaPercorrida() >= linhaDeChegada) {

            if (veiculo1.getDistanciaPercorrida() > veiculo2.getDistanciaPercorrida())
                System.out.println(" ---- Os dois cruzaram a linha de chegada, mas o veiculo1 foi mais longe! ----");
            else {
                System.out.println(" ---- Os dois cruzaram a linha de chegada, mas o veiculo2 foi mais longe! ----");
            }
        } else if (veiculo1.getDistanciaPercorrida() >= linhaDeChegada) {
            System.out.println(" ---- CAMPEÃO veiculo1 ---- ");
        } else if (veiculo2.getDistanciaPercorrida() >= linhaDeChegada) {
            System.out.println(" ---- CAMPEÃO veiculo2 ---- ");
        }
    }
}
