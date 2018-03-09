package avaliaçãofinal;
public class AvaliaçãoFinal {
    public static void main(String[] args) throws WTDisconnectedException , MsgInvalidaExpection{
        WTTextual wt = new WTTextual("e");
        WTTextual wtt = new WTTextual("a");
        wt.conectar();
        wtt.conectar();
        try{
            wt.enviarMSG(wtt, 2);
        }
        catch (Exception c){
            c.getMessage();
        }
        wt.desconectar();
        System.out.println( "Usuário conectado: " + wt.estaOnline());
        try{
            wtt.enviarMSG(wt, 3);
            System.out.println(wt.estaOnline());
        }
        catch(WTDisconnectedException b){
            System.out.println(b.getMessage());
        }
        wt.conectar();
        try{
            wt.enviarMsg(wtt, null);
        }
        catch(WTDisconnectedException d){
            System.out.println(d.getMessage());
        }
        catch (MsgInvalidaExpection f){
            System.out.println(f.getMessage());
        }
    }
    
}
