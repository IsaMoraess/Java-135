public class metodo {
     public static void main(String[] args) {
          ContaBancaria conta = new ContaBancaria("12345-6");
          
     //FAZENDO DEPOSITO
        conta.depositar(100.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.depositar(50.0, "Depósito mensal");
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.depositar(-20.0); // Teste de depósito com valor negativo
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
      }
}
