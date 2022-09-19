package JORDelivery;

public class ClientePessoaFisica extends Pessoa{

    //atributos
    private Long cpf;

    //construtor
    public ClientePessoaFisica(String nome, String endereco, String email, Integer telefone, Long cpf) {
        super(nome, endereco, email, telefone);
        this.cpf = cpf;
    }

    //métodos
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + "\nE-mail: " + this.getEmail() + "\nTelefone: " + this.getTelefone() + "\nCPF: " + this.cpf);
    }

    //getter para poder consultar os dados
    public long getCpf() {
        return cpf;
    }
}
