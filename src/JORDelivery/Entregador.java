package JORDelivery;



public class Entregador extends Pessoa{

    //atributos
    private Long cnh;
    private String tipoVeiculo;
    private Boolean isTurnoNoite;

    //construtor para criar um entregador comum
    public Entregador(String nome, String endereco, String email, Integer telefone, Long cnh, int tipoVeiculo) {
        super(nome, endereco, email, telefone);
        this.cnh = cnh;

        switch(tipoVeiculo){
            case 1:
                this.tipoVeiculo = "Moto";
                break;

            case 2:
                this.tipoVeiculo = "Carro Hatch";
                break;

            case 3:
                this.tipoVeiculo = "Carro Sedan";
                break;

            case 4:
                this.tipoVeiculo = "Utilitário";
                break;

            case 5:
                this.tipoVeiculo = "Van";
                break;

            case 6:
                this.tipoVeiculo = "Carreto";
                break;

            default:
                this.tipoVeiculo = "Indefinido";
                break;
        }
    }

    //construtor com sobrecarga para cadastrar entregadores noturnos
    public Entregador(String nome, String endereco, String email, Integer telefone, Long cnh, int tipoVeiculo, Boolean isTurnoNoite) {
        super(nome, endereco, email, telefone);
        this.cnh = cnh;
        this.isTurnoNoite = isTurnoNoite;

        switch(tipoVeiculo){
            case 1:
                this.tipoVeiculo = "Moto";
                break;

            case 2:
                this.tipoVeiculo = "Carro Hatch";
                break;

            case 3:
                this.tipoVeiculo = "Carro Sedan";
                break;

            case 4:
                this.tipoVeiculo = "Utilitário";
                break;

            case 5:
                this.tipoVeiculo = "Van";
                break;

            case 6:
                this.tipoVeiculo = "Carreto";
                break;

            default:
                this.tipoVeiculo = "Indefinido";
                break;
        }
    }

    //métodos
    @Override
    public void exibirDados() {
        if(isTurnoNoite){
            System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + "\nE-mail: " + this.getEmail() + "\nTelefone: " + this.getTelefone() + "\nCPF: " + this.cnh + "\nTipo de veículo: " + this.tipoVeiculo + "\nTurno: Noturno");
        } else {
            System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + "\nE-mail: " + this.getEmail() + "\nTelefone: " + this.getTelefone() + "\nCPF: " + this.cnh + "\nTipo de veículo: " + this.tipoVeiculo + "\nTurno: Diurno");
        }
    }

    public void atualizarTurno(){
        if(isTurnoNoite){
            this.isTurnoNoite = false;
        } else {
            this.isTurnoNoite = true;
        }
    }

    public void atualizarVeiculo(int novoVeiculo){
        switch(novoVeiculo){
            case 1:
                this.tipoVeiculo = "Moto";
                break;

            case 2:
                this.tipoVeiculo = "Carro Hatch";
                break;

            case 3:
                this.tipoVeiculo = "Carro Sedan";
                break;

            case 4:
                this.tipoVeiculo = "Utilitário";
                break;

            case 5:
                this.tipoVeiculo = "Van";
                break;

            case 6:
                this.tipoVeiculo = "Carreto";
                break;

            default:
                throw new RuntimeException("veículo inválido");
        }
    }

    //getters e setters
    public Long getCnh() {
        return cnh;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Boolean getTurnoNoite() {
        return isTurnoNoite;
    }

    public void setTurnoNoite(Boolean turnoNoite) {
        isTurnoNoite = turnoNoite;
    }
}
