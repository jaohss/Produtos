import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoas {
    String nome;
    String data_nasc;
    double altura;

    //Método construtor para inicializar os atributos
    Pessoas(String nome, String data_nasc, double altura){
        this.nome=nome;
        this.data_nasc=data_nasc;
        this.altura=altura;
    }

    /*Método para retornar o email do usuário utilizando o nome que foi utilizado
    A criação de um array String para armazenar a divisão do nome e sobrenome feita pelo método "split", que usa o espaço " " como um delimitador, que vai criar um array de strings.
    Na segunda linha cria um email concatenando as informações do nome, ".", sobrenome e dominio, onde nomes[0] é nome pois se configura como o primeiro indice do array, nomes[nomes.lengh-1] é o sobrenome porque se configura com o último indice do array.
    o método toLowerCase é usado para retornar as strings em letras minisculas
    */
    public String email(){
        String[] nomes = this.nome.split(" ");
        return nomes[0].toLowerCase()+"."+nomes[nomes.length-1].toLowerCase()+"@dominio.com";
    }

    //Chama o método responsável por fazer a conversão do formato da data e converte a data String que foi digitada para ser convertida em LocalDate.
    public String converteData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(this.data_nasc, formatter);
        return data.format(formatter);
        }
        
}
