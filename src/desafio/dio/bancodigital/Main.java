package desafio.dio.bancodigital;

public class Main {

    public static void main(String[] args) {

        Cliente murilo = new Cliente();
        murilo.setNome("Murilo");

        Conta cc = new ContaCorrente(murilo);
        Conta poupanca = new ContaPoupanca(murilo);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
