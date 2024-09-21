public class ProdutoApp {
   public static void main(String[] args) {

    //Instanciando o objeto com os parâmetros
    Produto p1 = new Produto("Farofa", "Yoki", 10, 15);

    //Chamada do método descricao() que contém os recursos de cada atributo
    System.out.println(p1.descricao());
   }
}
