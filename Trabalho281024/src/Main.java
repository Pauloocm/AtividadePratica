//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var veiculo1 = new Veiculo();
        var veiculo2 = new Veiculo();

        var corrida = new Corrida();

        corrida.SimularCorrida(veiculo1, veiculo2);
    }
}