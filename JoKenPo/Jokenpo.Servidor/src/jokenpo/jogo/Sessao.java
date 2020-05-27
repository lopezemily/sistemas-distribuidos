package jokenpo.jogo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Optional;
import jokenpo.jogo.DadosJogador;
import jokenpo.jogo.Match;
import jokenpo.rmi.ServidorSessao;

public class Sessao implements ServidorSessao {

    //A sessao manter uma lista de jogadores conectados (jogando ou esperando um adversario)
    private final ArrayList<DadosJogador> jogadores = new ArrayList();
    //A sessao também possui uma lista de matches, que são pessoas atribuidas em uma sessao
    private final ArrayList<Match> matches = new ArrayList();

    @Override
    public synchronized void conectar(String id, String nome) throws RemoteException {
        DadosJogador dados = new DadosJogador(id, nome);
        jogadores.add(dados);

        System.out.printf("Jogador %s chamado %s se conectou.\n", id, nome);
    }

    @Override
    public synchronized DadosJogador buscarAdversario(String meuId) throws RemoteException {
        //variavel auxiliar que armazena uma pesquisa, guardando de foi encontrado (true/false) e em caso de true guarda o conteudo
        Optional<DadosJogador> adversario;
        Optional<DadosJogador> jogador;
        Optional<Match> match;

        System.out.printf("Jogador %s esta buscando um adversario\n", meuId);
        System.out.printf("No momento ha %d jogadores conectados\n", jogadores.size());

        //busca se o jogador local já possui um match com outro jogados na lista de matches
        match = matches.stream().filter(m -> m.getIdJogador2().equals(meuId)).findFirst();

        if (match.isPresent()) {
            //Se o jogador local já tiver um match feito por um outro jogador, busca e retorna os dados do adversario
            String adversarioId = match.get().getIdJogador1();
            adversario = jogadores.stream().filter(dado -> dado.getId().equals(adversarioId)).findFirst();
            return adversario.get();
        } else {
            //Caso o jogador não seja o match de nenhum outro, busca um jogador que não esteja em um jogo e que não seja ele próprio
            adversario = jogadores.stream().filter(dado -> !dado.isEmSessao() && !dado.getId().equals(meuId)).findFirst();

            if (adversario.isPresent()) {
                //caso tenha encontrado um adversário disponível, cria um novo match e adiciona na lista de matches
                Match matchJ1J2 = new Match(meuId, adversario.get().getId());

                matches.add(matchJ1J2);

                //Busca meus dados e muda o estado dele próprio e do adversário para "em sessao" para não ser encontrado por outro jogador
                jogador = jogadores.stream().filter(dado -> dado.getId().equals(meuId)).findFirst();
                jogador.get().setEmSessao(true);
                adversario.get().setEmSessao(true);

                return adversario.get();
            } else {
                throw new RemoteException("Não há adversarios disponiveis");
            }
        }
    }

    @Override
    public synchronized void desconectar(String meuId) throws RemoteException {
        //Remove o jogador local da lista de jogadores conectados (jogando ou esperando um adversario)
        jogadores.removeIf(dado -> dado.getId().equals(meuId));
        
        //na lista de busca o próprio id para pegar os dados
        Optional<Match> match = matches.stream()
                .filter(m -> m.getIdJogador1().equals(meuId) || m.getIdJogador2().equals(meuId)).findFirst();

        //Remove o adversario da lista de jogadores e de matches (se ele for jogador 1 ou 2)
        if (match.isPresent()) {
            String idAdversario;
            if (match.get().getIdJogador1().equals(meuId)) {
                idAdversario = match.get().getIdJogador2();
                jogadores.removeIf(dado -> dado.getId().equals(idAdversario));
                matches.removeIf(m1 -> m1.getIdJogador1().equals(meuId));
            } else {
                idAdversario = match.get().getIdJogador1();
                jogadores.removeIf(dado -> dado.getId().equals(idAdversario));
                matches.removeIf(m1 -> m1.getIdJogador2().equals(meuId));
            }
        }
    }

    @Override
    public synchronized boolean jogadorEstaAtivo(String id) throws RemoteException {
        Optional<DadosJogador> jogador = jogadores.stream().filter(dado -> dado.getId().equals(id)).findFirst();
        return jogador.isPresent();
    }

}
