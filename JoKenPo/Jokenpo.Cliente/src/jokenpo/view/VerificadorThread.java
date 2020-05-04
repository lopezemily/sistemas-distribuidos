package jokenpo.view;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jokenpo.view.JokenpoPlay;
import jokenpo.rmi.ServidorSessao;

public class VerificadorThread implements Runnable {

    private final ServidorSessao servidorSessao;
    private final String idAdversario;
    private final JokenpoPlay jokenpoPlay;

    public VerificadorThread(ServidorSessao servidorSessao, String idAdversario, JokenpoPlay jokenpoPlay) {
        this.servidorSessao = servidorSessao;
        this.idAdversario = idAdversario;
        this.jokenpoPlay = jokenpoPlay;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (!servidorSessao.jogadorEstaAtivo(idAdversario)) {
                    JOptionPane.showMessageDialog(jokenpoPlay, "Seu jogo foi desconectado!", "Desconectado", JOptionPane.ERROR_MESSAGE);
                    this.jokenpoPlay.desconectar();
                    break;
                }
            } catch (RemoteException ex) {
                Logger.getLogger(VerificadorThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
