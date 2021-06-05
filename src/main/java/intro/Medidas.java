// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 -  Classe
public class Medidas {
    // 3.1 -  Atributos - Características

    //  3.2 - Métodos e funções
    public static void main (String[] args) {
        System.out.println("Cheguei mundo");
        System.out.println("Cálculo de Areas");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de "+ largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento +" m2");



    }

        public void calcularAreaModoExtenso( ){// Calculo de área - Exemplo: o tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4; // largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de "+ largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado +" m2");

    }



    public void calcularAreaModoCompacto(){
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de "+ largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento +" m2");
    }

}
