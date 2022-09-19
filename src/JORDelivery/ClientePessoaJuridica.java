package JORDelivery;

public class ClientePessoaJuridica extends Pessoa{

    //atributos
    private Long cnpj;

    //construtor
    public ClientePessoaJuridica(String nome, String endereco, String email, Integer telefone, Long cnpj) {
        super(nome, endereco, email, telefone);
        this.cnpj = cnpj;
    }

    //métodos
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + "\nE-mail: " + this.getEmail() + "\nTelefone: " + this.getTelefone() + "\nCPF: " + this.cnpj);
    }

    //getter para poder consultar os dados
    public Long getCnpj() {
        return cnpj;
    }
}
