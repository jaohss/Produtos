public class Produto {
    String nome;
    String marca;
    double preco_custo;
    double preco_venda;

    //Método construtor para inicializar os atributos
    Produto(String nome, String marca, double preco_custo, double preco_venda){
        this.nome = nome;
        this.marca=marca;
        this.preco_custo=preco_custo;
        this.preco_venda=preco_venda;
    }

    //Método responsável por retornar o lucro, fazendo a subtração entre o preço da venda e do lucro
    public double calculoLucro(){
        return preco_venda-preco_custo;
    }

    //Método String responsável por retornar as informações presentes em cada atributo
    public String descricao(){
        return "Nome: "+this.nome +"\n"+
        "Marca: "+this.marca +"\n"+
        "Custo: R$"+this.preco_custo +"\n"+
        "Venda: R$"+ this.preco_venda +"\n"+
        "Lucro: R$"+calculoLucro();

    }
    
}
