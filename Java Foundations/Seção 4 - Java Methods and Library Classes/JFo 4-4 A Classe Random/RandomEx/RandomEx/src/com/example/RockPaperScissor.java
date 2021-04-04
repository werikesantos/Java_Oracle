package com.example;
import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissor {

    public static void main(String[] args) {
      
        String[] opcoes = {"PEDRA", "PAPEL", "TESOURA"};
        
        String numeroUsuario = (String) JOptionPane.showInputDialog(null, "Escolha:", "JANKENPON", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[1]);
        
        String usuarioResult, usuarioPC;
        
        if(numeroUsuario.equals("PEDRA")){
            usuarioResult = "PEDRA";
        }else if(numeroUsuario.equals("PAPEL")){
            usuarioResult = "PAPEL";
        }else{
            usuarioResult = "TESOURA";
        }
        
        Random rand = new Random();
        int numeroPC = rand.nextInt(4);        
        
        if(numeroPC == 0){
            usuarioPC = "PEDRA";
        }else if(numeroPC == 1){
            usuarioPC = "PAPEL";
        }else{
            usuarioPC = "TESOURA";
        }
        
        if(usuarioResult == usuarioPC){
            JOptionPane.showMessageDialog(null, "USUÁRIO:\n"+usuarioResult+"\n \nJ.A.R.V.I.S:\n"+usuarioPC+"\n=========================\nEMBATE:\n"+usuarioResult+" X "+usuarioPC+"\n\n# EMPATE"+"\n=========================\nPLACAR:\nUSUÁRIO X J.A.R.V.I.S.\n        "+1+"                   "+2+"\n\n\nPARABÉNS!!!\n\n\n", "EMPATE!", JOptionPane.PLAIN_MESSAGE);
        }else if((usuarioResult.equals("PEDRA"))&&(usuarioPC.equals("PAPEL")) || (usuarioResult.equals("TESOURA"))&&(usuarioPC.equals("PEDRA")) || (usuarioResult.equals("PAPEL"))&&(usuarioPC.equals("TESOURA"))){
            JOptionPane.showMessageDialog(null, "J.A.R.V.I.S:\n"+usuarioPC+"\n \nUSUÁRIO:\n"+usuarioResult+"\n=========================\nEMBATE:\n"+usuarioPC+" X "+usuarioResult+"\n\n"+"# "+usuarioPC+" GANHA DE "+usuarioResult+"\n=========================\nPLACAR:\nUSUÁRIO X J.A.R.V.I.S.\n        "+1+"                   "+2+"\n\n\nPARABÉNS - J.A.R.V.I.S.!!!\n\n\n", "VENCEDOR - J.A.R.V.I.S.", JOptionPane.PLAIN_MESSAGE);
        }else if((usuarioResult.equals("PAPEL"))&&(usuarioPC.equals("PEDRA")) || (usuarioResult.equals("PEDRA"))&&(usuarioPC.equals("TESOURA")) || (usuarioResult.equals("TESOURA"))&&(usuarioPC.equals("PAPEL"))){
            JOptionPane.showMessageDialog(null, "USUÁRIO:\n"+usuarioResult+"\n \nJ.A.R.V.I.S:\n"+usuarioPC+"\n=========================\nEMBATE:\n"+usuarioResult+" X "+usuarioPC+"\n\n"+"# "+usuarioResult+" GANHA DE "+usuarioPC+"\n=========================\nPLACAR:\nUSUÁRIO X J.A.R.V.I.S.\n        "+1+"                   "+2+"\n\n\nPARABÉNS - USUÁRIO!!!\n\n\n", "VENCEDOR  - USUÁRIO", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }
}
