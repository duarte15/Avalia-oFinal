package avaliaçãofinal;
public class LongTextMsg extends Mensagem{
    private String texto;
    public LongTextMsg(String remetente, WTTextual destinatario, String texto) {
        super(remetente, destinatario);
        setTexto(texto);
        setConteudo(getTexto());
        if (texto == null){
            throw new MsgInvalidaExpection();
        }
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
