import java.time.LocalDate;//classe utilizada para utilizar datas
import java.time.format.DateTimeFormatter;//classe utilizada para formatação de datas
import java.util.Scanner;

public class PessoasApp {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        //Instancionando o objeto da data atual utilizando a classe LocalDate
        LocalDate dataAtual = LocalDate.now();

        //Instanciando o objeto criado
        Pessoas p1 = new Pessoas(null, null, 0);


        //Entrada de dados
        System.out.println("Digite o nome completo: ");
        p1.nome = scn.nextLine();

        System.out.println("Digite a data de nascimento: ");
        p1.data_nasc = scn.nextLine();


        /*Caso a data inserida for posterior da data atual, será impresso a mensagem "Data inválida" e o programa será encerrado, caso ao contrário, o programa seguirá.
        O método isAfter() é utilizado como uma condicional para datas, que vai verificar se a primeira data é posterior a data atual
        O método LocalDate.parse foi utilizado para converter a string data_nasc para
        */
        if(LocalDate.parse(p1.data_nasc, DateTimeFormatter.ofPattern("dd/MM/yyyy")).isAfter(dataAtual)){
            System.out.println("Data inválida. Insira uma data anterior ao dia de hoje");

        }
        else{
            System.out.println("Digite a altura: ");
            p1.altura = scn.nextDouble();

            System.out.println();

            //Chama o método da criação do email
            System.out.println(p1.email());

            //Chama o método da conversão e comparação de datas
            System.out.println(p1.converteData());

        }
        scn.close();
    }
    
}
