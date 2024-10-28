public class Veiculo {
    private int velocidade;
    private int distanciaPercorrida;


    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;

        this.distanciaPercorrida += velocidade;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
}
