package JORDelivery;

public class Main {

    public static void main(String[] args) {

        //Clientes Pessoa Física
        ClientePessoaFisica cliente1 = new ClientePessoaFisica("Rubia Falcão Amorim", "Travessa Juá, 87, CEP: 68909-618, Macapá/AP", "rubiaamorim@email.com", 987427375, 28093465340L);
        ClientePessoaFisica cliente2 = new ClientePessoaFisica("Elino Barrada Bragança", "Rua Santa Clara, 202, CEP: 69312-349, Boa Vista/RR", "elino.braganca@geradornv.com.br", 985565282, 15820306260L);
        ClientePessoaFisica cliente3 = new ClientePessoaFisica("Wanda Palmas Vitorino", "Avenida Uraçá, 2437, CEP: 79018-031, Campo Grande/MS", "wanda.vitorino@geradornv.com.br", 969911216, 29754246122L);

        //Clientes PJ
        ClientePessoaJuridica cliente4 = new ClientePessoaJuridica("Borges Carvalho Ferragens ME", "Rua William de Oliveira, 302, CEP: 58436-156, Campina Grande/PB", "ferragens.borges@geradornv.com.br", 22930213, 71544337000108L);
        ClientePessoaJuridica cliente5 = new ClientePessoaJuridica("Esteves Amorim Funilaria LTDA", "Rua Cafelândia, 558, CEP: 78710-856, Rondonópolis/MT", "funilaria.esteves@geradornv.com.br", 35271270, 66567693000107L);
        ClientePessoaJuridica cliente6 = new ClientePessoaJuridica("Jales Alves Floricultura LTDA", "Rua Jaime Cerveira, 880, CEP: 79017-060, Campo Grande/MS", "floricultura.jales@geradornv.com.br", 32552541, 31771347000161L);

        //Entregadores
        Entregador entregador1 = new Entregador("Nei Furtado Borralho", "Rua Dois, 127, CEP: 23036-064, Rio de Janeiro/RJ", "nei.borralho@geradornv.com.br", 996451672, 25741356650L, 1);
        Entregador entregador2 = new Entregador("Rogério Leite Marica", "Quadra QN 8F Bloco D, CEP: 71880-184, Brasília/DF", "rogerio.marica@geradornv.com.br", 983886085, 73303192592L, 5, true);
        Entregador entregador3 = new Entregador("Bento Cavalcanti Ramos", "Rua Bela Vista, 926, CEP: 27288-361, Volta Redonda/RJ", "bento.ramos@geradornv.com.br", 996155006, 41314511400L, 4);
        Entregador entregador4 = new Entregador("Iago França Diniz", "Rua Ruy Virmond Carnasciali, 1762, CEP: 80310-550, Curitiba/PR", "iago.diniz@geradornv.com.br", 979427459, 11976862528L, 6, true);

        //Pacotes
        Pacote pacote1 = new Pacote(256849, "Geladeira Metalfrio", "185 x 82 x 70", 60.00, true);
        Pacote pacote2 = new Pacote(559874, "Notebook Acer", "48 x 34 x 9", 3.20, true);
        Pacote pacote3 = new Pacote(974523, "Livros", "35 x 25 x 15", 6.2, false);
        Pacote pacote4 = new Pacote(698544,"Impressão Fine Art", "60 x 20 x 10", 0.8, false);

        //Rotas
        Rota rota1 = new Rota(223547, pacote4, 1, cliente1, cliente2, null);
        Rota rota2 = new Rota(228963, pacote2, 2, cliente4, cliente3, entregador1);
        Rota rota3 = new Rota(226345, pacote1, 3, cliente5, cliente6, entregador2);
        Rota rota4 = new Rota(227319, pacote3, 4, cliente2, cliente4, entregador3);

        rota1.atualizarEntregador(entregador4);
        rota1.atualizarStatus(2);
        rota1.exibirDados();

        rota2.exibirDados();

        rota3.exibirDados();

        rota4.exibirDados();

    }
}
