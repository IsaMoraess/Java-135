/*Exercício 2: Sistema de Contas Bancárias (Sobrecarga de Método)
Objetivo: Criar uma classe ContaBancaria que permite diferentes formas de depósito.
Passos:
1.	Defina a classe ContaBancaria com atributos private String numeroConta e private double saldo.
2.	Crie o método public void depositar(double valor) para depósitos simples.
3.	Sobrecarga o método depositar para permitir um depósito com descrição: public void depositar(double valor, String descricao).
4.	Crie um método public double getSaldo() para retornar o saldo.
5.	Teste a classe no método main, realizando depósitos e exibindo o saldo.
 */

 public class ContaBancaria {
     // ATRIBUTOS PRIVADOS
     private String numeroConta;
     private double saldo;
 
     // CONSTRUTOR
     public ContaBancaria(String numeroConta) {
         this.numeroConta = numeroConta;
         this.saldo = 0.0; // Inicializa o saldo em zero
     }
 
     // MÉTODO PARA DEPÓSITO SIMPLES
     public void depositar(double valor) {
         if (valor > 0) {
             saldo += valor;
             System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
         } else {
             System.out.println("Valor de depósito deve ser positivo.");
         }
     }
 
     // SOBRECARGA DO MÉTODO DE DEPÓSITO
     public void depositar(double valor, String descricao) {
         if (valor > 0) {
             saldo += valor;
             System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Descrição: " + descricao);
         } else {
             System.out.println("Valor de depósito deve ser positivo.");
         }
     }
 
     // MÉTODO PARA RETORNAR O SALDO
     public double getSaldo() {
         return saldo;
     }
}