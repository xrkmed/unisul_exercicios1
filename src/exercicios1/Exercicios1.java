/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios1;

import javax.swing.JOptionPane;

/**
 *
 * @author 10723114613
 */
public class Exercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        do {
            try{
                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada: \n1 - Exercicio 1 \n2 - Exercicio 2 \n3 - Exercicio 3\n4 - Exercicio 4\n5 - Exercicio 5\n6 - Exercicio 6\n7 - Exercicio 7\n8 - Exercicio 8\n9 - Exercicio 9\n10 - Exercicio 10\n11 - Fechar", "Menu", JOptionPane.QUESTION_MESSAGE));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar o programa!", "Obrigado", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            switch(option){
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 6:
                    exercicio6();
                    break;
                case 7:
                    exercicio7();
                    break;
                case 8:
                    exercicio8();
                    break;
                case 9:
                    exercicio9();
                    break;
                case 10:
                    exercicio10();
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o programa!", "Obrigado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }while(option != 11);
   }

    public static void exercicio1(){
        int lado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado do quadrado: ", "Lado do quadrado", JOptionPane.QUESTION_MESSAGE));
        int area = lado * lado;
        int perimetro = lado * 4;
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area + "\nO perímetro do quadrado é: " + perimetro, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio2(){
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: ", "Nota 1", JOptionPane.QUESTION_MESSAGE));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: ", "Nota 2", JOptionPane.QUESTION_MESSAGE));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota: ", "Nota 3", JOptionPane.QUESTION_MESSAGE));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quarta nota: ", "Nota 4", JOptionPane.QUESTION_MESSAGE));

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        JOptionPane.showMessageDialog(null, "A média é: " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio3(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome de fulano: ", "Nome do aluno", JOptionPane.QUESTION_MESSAGE);
        String faturaVencimentoDia = JOptionPane.showInputDialog(null, "Digite o dia de vencimento da fatura: ", "Dia de vencimento", JOptionPane.QUESTION_MESSAGE);
        String faturaVencimentoMes = JOptionPane.showInputDialog(null, "Digite o mês de vencimento da fatura: ", "Mês de vencimento", JOptionPane.QUESTION_MESSAGE);
        String faturaValor = JOptionPane.showInputDialog(null, "Digite o valor da fatura: ", "Valor da fatura", JOptionPane.QUESTION_MESSAGE);
        showFatura(nome, faturaVencimentoDia, faturaVencimentoMes, faturaValor);
   }

    public static void showFatura(String nome, String dia, String mes, String valor){
        JOptionPane.showMessageDialog(null, String.format("Olá, %s\nA sua fatura com vencimento em %s de %s no valor de R$ %s está fechada.", nome, dia, mes, valor), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio4(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Número inteiro", JOptionPane.QUESTION_MESSAGE));
        int dezena = (numero % 100) / 10;
        JOptionPane.showMessageDialog(null, "O dígito das dezenas é: " + dezena, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio5(){
        int segundos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de segundos: ", "Segundos", JOptionPane.QUESTION_MESSAGE));
        int dias = segundos / 86400;
        int horas = (segundos % 86400) / 3600;
        int minutos = ((segundos % 86400) % 3600) / 60;
        int segundosRestantes = ((segundos % 86400) % 3600) % 60;
        JOptionPane.showMessageDialog(null, String.format("%d segundos equivalem a %d dias, %d horas, %d minutos e %d segundos.", segundos, dias, horas, minutos, segundosRestantes), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio6(){
        int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de anos: ", "Anos", JOptionPane.QUESTION_MESSAGE));
        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de meses: ", "Meses", JOptionPane.QUESTION_MESSAGE));
        int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de dias: ", "Dias", JOptionPane.QUESTION_MESSAGE));

        int diasTotais = (anos * 365) + (meses * 30) + dias;
        JOptionPane.showMessageDialog(null, String.format("%d anos, %d meses e %d dias equivalem a %d dias.", anos, meses, dias, diasTotais), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio7(){
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do salário: ", "Salário", JOptionPane.QUESTION_MESSAGE));
        double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do salário mínimo: ", "Salário mínimo", JOptionPane.QUESTION_MESSAGE));
        double quantidadeSalarios = salario / salarioMinimo;
        JOptionPane.showMessageDialog(null, String.format("O salário de R$ %.2f equivale a %.2f salários mínimos.", salario, quantidadeSalarios), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio8(){
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo da conta bancária: ", "Saldo", JOptionPane.QUESTION_MESSAGE));
        double saldoReajustado = saldo + (saldo * 0.01);
        JOptionPane.showMessageDialog(null, String.format("O saldo reajustado é: R$ %.2f", saldoReajustado), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio9(){
     double ipi = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a porcentagem do IPI: ", "IPI", JOptionPane.QUESTION_MESSAGE));
        double valorUnitarioProduto1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor unitário do produto 1: ", "Valor unitário do produto 1", JOptionPane.QUESTION_MESSAGE));
        int quantidadeProduto1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do produto 1: ", "Quantidade do produto 1", JOptionPane.QUESTION_MESSAGE));
        double valorUnitarioProduto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor unitário do produto 2: ", "Valor unitário do produto 2", JOptionPane.QUESTION_MESSAGE));
        int quantidadeProduto2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do produto 2: ", "Quantidade do produto 2", JOptionPane.QUESTION_MESSAGE));
        double valorTotalProdutos = (valorUnitarioProduto1 * quantidadeProduto1) + (valorUnitarioProduto2 * quantidadeProduto2);
        double valorTotalProdutosComIpi = valorTotalProdutos + (valorTotalProdutos * (ipi / 100));
        JOptionPane.showMessageDialog(null, String.format("O valor total dos produtos é: R$ %.2f\nO valor total dos produtos com IPI é: R$ %.2f", valorTotalProdutos, valorTotalProdutosComIpi), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exercicio10(){
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de x: ", "Valor de x", JOptionPane.QUESTION_MESSAGE));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de y: ", "Valor de y", JOptionPane.QUESTION_MESSAGE));
        int xVezesY = x * y;
        int xMaisY = x + y;
        int xDivididoPorY = x / y;
        int restoDivisaoXY = x % y;
        double doubleDivisaoXY = (double) x / y;
        JOptionPane.showMessageDialog(null, String.format("x vezes y: %d\nx mais y: %d\nx dividido por y: %d\nresto da divisão de x por y: %d\ndouble da divisão de x por y: %.2f", xVezesY, xMaisY, xDivididoPorY, restoDivisaoXY, doubleDivisaoXY), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
