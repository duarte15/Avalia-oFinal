package avaliaçãofinal;
import java.util.Scanner;
public class WTTextual {
    private String nickname;
    private boolean estaOnline ;
    private Mensagem msgAtual;
    
    public WTTextual(String nickname){
        setNickname(nickname);
    }
    
    public String verStatus(){
        if(estaOnline()){
            return getNickname() + " está online :)";
        }
        else{
            return getNickname() + " está Offline :(";
        }
    }
    
    public  void conectar(){
        setEstaOnline(true);
    }
    
    public void desconectar(){
        setEstaOnline(false);
    }
    
    public boolean estaOnline(){
        return estaOnline;
    }
    
    public void enviarMSG(WTTextual dest, int opc) throws WTDisconnectedException{
        if (dest.estaOnline()){
            new QuickEmoticonMsg(nickname, dest, opc);
            dest.receberMsg(msgAtual);
        }
        else{
            throw new WTDisconnectedException();
        }
    }
    
    public void enviarMsg(WTTextual dest, String txt)throws WTDisconnectedException{
        if (dest.estaOnline()){
            new LongTextMsg(nickname, dest, txt);
            dest.receberMsg(msgAtual);
        }
        else{
            throw new WTDisconnectedException();

        }
    }
    
    public void receberMsg(Mensagem m){
        System.out.println("Remetente: " + m.getRemetente() + "Mensagem: " + m.getConteudo());
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEstaOnline(boolean estaOnline) {
        this.estaOnline = estaOnline;
    }

    public Mensagem getMsgAtual() {
        return msgAtual;
    }

    public void setMsgAtual(Mensagem msgAtual) {
        this.msgAtual = msgAtual;
    }    
}