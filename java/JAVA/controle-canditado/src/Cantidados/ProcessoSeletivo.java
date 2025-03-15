package Cantidados;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       // selecaoCandidatos();
       // System.out.println("Processo seletivo");

        String [] candidatos = {"MONICA", "FABRICIO", "MIRELA", "DANIELA", "JONAS"};
        for(String candidato: candidatos) {
entradoEmContato(candidato);
        }
        

        // dados fixo
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);

        // adiciona dados pelo terminal
        // Scanner scan = new Scanner(System.in);

        // System.out.print("Digite o salário pretendido: ");
        // double salarioPretendido = scan.nextDouble(); // Ler o salário como double

        // analisarCandidato(salarioPretendido); // Chamar a função corretamente

        // scan.close(); // Fechar o Scanner para evitar vazamento de recursos
    }

    static void entradoEmContato(String canditado) {
        int tentativaRealizada = 1;
        boolean continuatentandi = true;
        boolean atendeu= false;

        do{
            atendeu=atender();
            continuatentandi=!atendeu;
            if (continuatentandi) 
                tentativaRealizada++;
            else System.out.println("contato com sucsso");

        }while(continuatentandi && tentativaRealizada<3);
        if (atendeu) {
            System.out.println("CONSEGUIR CONTATO COM "+ canditado+ "na" +tentativaRealizada + "tentativa");
            
        }else
        System.out.println("nao conseguimos contato com" + canditado+"numero maximo"+tentativaRealizada);
    }


    static boolean atender() {

        return new Random().nextInt(3)==1;
    }
static void imprimirselecionados(){
    String [] canditados = {"MONICA", "FABRICIO", "MIRELA", "DANIELA", "JONAS"};
    System.out.println("imprimindo  a lista de canditados informando o indice do elemento");
    for( int indice=0; indice< canditados.length;indice++){
        System.out.println("o canditado de nº"+(indice+1)+"e"+canditados[indice]);
    }

    System.out.println("forma abrevida de interacao for each");
    for(String candidato: canditados){
        System.out.println("o canditado seleciona e "+ candidato);
    }
    }



    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JONAS"};

        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length ){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o canditado " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("o canditado "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o canditado");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o canditado com contra proposta");
        } else {
            System.out.println("Aguardar resuldado dos demais canditato");
        }
    }
}
