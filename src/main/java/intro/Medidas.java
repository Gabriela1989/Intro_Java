// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import java.sql.SQLOutput;
import java.util.Scanner;

// 3 -  Classe
public class Medidas {
    // 3.1 -  Atributos - Características

    //  3.2 - Métodos e funções
    public static void main (String[] args) {
        // Condicional = verificar uma condilção - Fazer uma pergunta para uma pessoa, um hardware  ou software

        //Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Ô E S");
        System.out.println("c - Calcular Area modo curto");
        System.out.println("d - Contar até dez");
        System.out.println("e - Calcular Area modo extenso");
        System.out.println("i - IfSimples");
        System.out.println("r - Contagem regressiva de 10 a 0");
        System.out.println("Digite a opção desejada:");
        String opcao = scanner.next();

        // Switch = selcionar o comportamento do programda conforme a escolha da pessoa ou  do software

        // String opcao  = "curto";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModocurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu contarAtedez");
                contarAte10();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifsSimples");
                ifSimples();;
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
              break;


        }


    }

    public static void ifSimples(){
        // Condicional = verificar uma condilção - Fazer uma pergunta para uma pessoa, um hardware  ou software

        // if =se
        // else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoCurto() {
        System.out.println("Cálculo de Areas Modo Curto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de "+ largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento +" m2");

    }
            public static void calcularAreaModoExtenso( )

    { System.out.println("Cálculo de Areas Modo Extenso");

    // Calculo de área - Exemplo: o tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de "+ largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado +" m2");

       }
    public static void contarAte10(){
        // loops ou repetições
        //for = repetição incondicional
        System.out.println("Contagem Crescente");

        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }

    }
    public static void contagemRegressiva(){
        System.out.println("Contagem regressiva");

        for(int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }
   }
