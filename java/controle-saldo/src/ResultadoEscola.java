public class ResultadoEscola {
    public static void main(String[] args) {
        // int nota = 6;

        // if (nota>= 7) {
        //     System.out.println("aprovador");
        // }

        // else if (nota >=5 && nota <7)
        // System.out.println("    recuperacao");
        // else
        // System.out.println("Reprovado");


        int nota =5 ;
String resultado =  nota >= 7 ? "aprovado" : "reprovado";

System.out.println(resultado);

int nota3 =3 ;
String resultado2 =  nota3 >= 7 ? "aprovado" : nota3 >=5  && nota3 <7 ? "recuperacao" : "reprovado";

System.out.println(resultado2);
    }



}