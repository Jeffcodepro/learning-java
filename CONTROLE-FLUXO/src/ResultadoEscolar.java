
public class ResultadoEscolar {
    public static void main(String[] args) {
        /*int nota = 7;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");*/

        //escrita mais clara e concisa do trecho acima

        /*int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);*/

        //ou até mais elaborado

        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        

    }
}
