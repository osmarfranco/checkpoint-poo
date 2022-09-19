package JORDelivery;

public class Rota {

    //atributos
    private Integer idRota;
    private Integer idPacote;
    private String status;
    private String endColeta;
    private String endEntrega;
    private ClientePessoaJuridica destinatarioPJ;
    private ClientePessoaFisica destinatarioPF;
    private ClientePessoaJuridica remetentePJ;
    private ClientePessoaFisica remetentePF;
    private Entregador entregador;
    private int tipoDeRota;

    //construtor Remetente e Destinatário PF
    public Rota(Integer idRota, Pacote pacote, int status, ClientePessoaFisica destinatario, ClientePessoaFisica remetente, Entregador entregador) {
        this.idRota = idRota;
        this.idPacote = pacote.getIdPacote();
        this.endColeta = remetente.getEndereco();
        this.endEntrega = destinatario.getEndereco();
        this.destinatarioPF = destinatario;
        this.remetentePF = remetente;
        this.entregador = entregador;
        this.tipoDeRota = 1;

        switch (status){
            case 1:
                this.status = "Em Preparação";
                break;

            case 2:
                this.status = "Aguardando Coleta";
                break;

            case 3:
                this.status = "Em trânsito";
                break;

            case 4:
                this.status = "Entregue";
                break;

            case 5:
                this.status = "Extraviado";
                break;

            case 6:
                this.status = "Destinatário Ausente";
                break;

            case 7:
                this.status = "Cancelado";
                break;

            default:
                this.status = "Não definido";
                break;
        }
    }

    //construtor Remetente PF e Destinatário PJ
    public Rota(Integer idRota, Pacote pacote, int status, ClientePessoaJuridica destinatario, ClientePessoaFisica remetente, Entregador entregador) {
        this.idRota = idRota;
        this.idPacote = pacote.getIdPacote();
        this.endColeta = remetente.getEndereco();
        this.endEntrega = destinatario.getEndereco();
        this.destinatarioPJ = destinatario;
        this.remetentePF = remetente;
        this.entregador = entregador;
        this.tipoDeRota = 2;

        switch (status){
            case 1:
                this.status = "Em Preparação";
                break;

            case 2:
                this.status = "Aguardando Coleta";
                break;

            case 3:
                this.status = "Em trânsito";
                break;

            case 4:
                this.status = "Entregue";
                break;

            case 5:
                this.status = "Extraviado";
                break;

            case 6:
                this.status = "Destinatário Ausente";
                break;

            case 7:
                this.status = "Cancelado";
                break;

            default:
                this.status = "Não definido";
                break;
        }
    }

    //construtor Remetente e Destinatário PJ
    public Rota(Integer idRota, Pacote pacote, int status, ClientePessoaJuridica destinatario, ClientePessoaJuridica remetente, Entregador entregador) {
        this.idRota = idRota;
        this.idPacote = pacote.getIdPacote();
        this.endColeta = remetente.getEndereco();
        this.endEntrega = destinatario.getEndereco();
        this.destinatarioPJ = destinatario;
        this.remetentePJ = remetente;
        this.entregador = entregador;
        this.tipoDeRota = 3;

        switch (status){
            case 1:
                this.status = "Em Preparação";
                break;

            case 2:
                this.status = "Aguardando Coleta";
                break;

            case 3:
                this.status = "Em trânsito";
                break;

            case 4:
                this.status = "Entregue";
                break;

            case 5:
                this.status = "Extraviado";
                break;

            case 6:
                this.status = "Destinatário Ausente";
                break;

            case 7:
                this.status = "Cancelado";
                break;

            default:
                this.status = "Não definido";
                break;
        }
    }

    //construtor Remetente PJ e Destinatário PF
    public Rota(Integer idRota, Pacote pacote, int status, ClientePessoaFisica destinatario, ClientePessoaJuridica remetente, Entregador entregador) {
        this.idRota = idRota;
        this.idPacote = pacote.getIdPacote();
        this.endColeta = remetente.getEndereco();
        this.endEntrega = destinatario.getEndereco();
        this.destinatarioPF = destinatario;
        this.remetentePJ = remetente;
        this.entregador = entregador;
        this.tipoDeRota = 4;

        switch (status){
            case 1:
                this.status = "Em Preparação";
                break;

            case 2:
                this.status = "Aguardando Coleta";
                break;

            case 3:
                this.status = "Em trânsito";
                break;

            case 4:
                this.status = "Entregue";
                break;

            case 5:
                this.status = "Extraviado";
                break;

            case 6:
                this.status = "Destinatário Ausente";
                break;

            case 7:
                this.status = "Cancelado";
                break;

            default:
                this.status = "Não definido";
                break;
        }
    }

    //métodos
    public void exibirDados(){
        switch (this.tipoDeRota){
            case 1:
                //PF -> PF
                System.out.println("ID: " + this.idRota + "\nStatus: " + this.status + "\nPacote: " + this.idPacote + "\nDestinatário: " + this.destinatarioPF.getNome() + "\nEndereço de Entrega: " + this.endEntrega + "\nRemetente: " + this.remetentePF.getNome() + "\nEndereço de Coleta: " + this.endColeta + "\nEntregador: " + this.entregador.getNome());
                break;

            case 2:
                // PF -> PJ
                System.out.println("ID: " + this.idRota + "\nStatus: " + this.status + "\nPacote: " + this.idPacote + "\nDestinatário: " + this.destinatarioPJ.getNome() + "\nEndereço de Entrega: " + this.endEntrega + "\nRemetente: " + this.remetentePF.getNome() + "\nEndereço de Coleta: " + this.endColeta + "\nEntregador: " + this.entregador.getNome());
                break;

            case 3:
                // PJ -> PJ
                System.out.println("ID: " + this.idRota + "\nStatus: " + this.status + "\nPacote: " + this.idPacote + "\nDestinatário: " + this.destinatarioPJ.getNome() + "\nEndereço de Entrega: " + this.endEntrega + "\nRemetente: " + this.remetentePJ.getNome() + "\nEndereço de Coleta: " + this.endColeta + "\nEntregador: " + this.entregador.getNome());
                break;

            case 4:
                // PJ -> PF
                System.out.println("ID: " + this.idRota + "\nStatus: " + this.status + "\nPacote: " + this.idPacote + "\nDestinatário: " + this.destinatarioPF.getNome() + "\nEndereço de Entrega: " + this.endEntrega + "\nRemetente: " + this.remetentePJ.getNome() + "\nEndereço de Coleta: " + this.endColeta + "\nEntregador: " + this.entregador.getNome());
                break;
        }
    }

    public void atualizarStatus(int novoStatus){
        switch (novoStatus){
            case 1:
                this.status = "Em Preparação";
                break;

            case 2:
                this.status = "Aguardando Coleta";
                break;

            case 3:
                this.status = "Em trânsito";
                break;

            case 4:
                this.status = "Entregue";
                break;

            case 5:
                this.status = "Extraviado";
                break;

            case 6:
                this.status = "Destinatário Ausente";
                break;

            case 7:
                this.status = "Cancelado";
                break;
        }
    }

    public void atualizarEntregador(Entregador novoEntregador){
        this.entregador = novoEntregador;
    };
}