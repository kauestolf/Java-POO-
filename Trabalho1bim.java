//Trabalho de Programação Orientada a Objeto (Java)
//Import para ter um leitor no codigo
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Nome de entrada para o leitor do codigo
    Scanner entrada = new Scanner(System.in);
    //Criando varieis de inteiros para quantidades a ser utilizada nos calculos
    int QtdHomens, QtdMulheres, QtdCriancas, QtdCerveja, CarnesHomem, CarnesMulher, CarnesCriancas, CervejasGeral,
        TotalPessoas, CarnesTotal;
    //criando variveis com float para quantidades a ser utilizadas nos calculos
    float KgCarnes;
    //Menu da calculadora
    System.out.println("________________________");
    System.out.println("Calculadora de churrasco");
    System.out.println("________________________");
    //Primeira solicitacao de entrada
    System.out.println("Digite a quantidade de homens");
    QtdHomens = entrada.nextInt();
    //Segunda solicitacao de entrada
    System.out.println("Digite a quantidade de mulheres");
    QtdMulheres = entrada.nextInt();
    //Terceira solicitacao de entrada
    System.out.println("Digite a quantidade de criancas");
    QtdCriancas = entrada.nextInt();
    //Quarta solicitacao de entrada
    System.out.println("Digite a quantidade de bebados que terão no churras");
    QtdCerveja = entrada.nextInt();

    //Calculo para saber a quantidade total inserida nas entradas
    TotalPessoas = QtdCriancas + QtdHomens + QtdMulheres;
    //Calculo para saber a quantidade em Gramas de carnes para os homens
    CarnesHomem = QtdHomens * 400;
    //Calculo para saber a quantidade em Gramas de carnes para as mulheres
    CarnesMulher = QtdMulheres * 400;
    //Calculo para saber a quantidade em Gramas de carnes para as criancas
    CarnesCriancas = QtdCriancas * 200;
    //Calculo para saber a quantidade em Latas de cerveja para as pessoas
    CervejasGeral = QtdCerveja * 4;
    //Quantidade total em Gramas de carnes
    CarnesTotal = CarnesCriancas + CarnesHomem + CarnesMulher;
    //Transformando as Gramas das carnes em Kg
    KgCarnes = CarnesTotal / 1000;
    //Mostrando o resultado do churrasco
    System.out.print("Para um churrasco de " + TotalPessoas + " pessoas, Serão necessário " + KgCarnes
        + " Kg de carne e " + CervejasGeral + " latas de cerveja");
  }
}
