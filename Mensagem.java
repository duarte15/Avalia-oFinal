package avaliaçãofinal;
public abstract class Mensagem extends WTTextual{
    private String remetente;
    private WTTextual destinatario;
    private String conteudo;

    public Mensagem(String remetente, WTTextual detinatario) {
        super(remetente);
        setDestinatario(destinatario);
        setRemetente(remetente);
    }
  
    public String getRemetente(){
        return remetente;
    }
    
    public WTTextual getDestinatatio(){
        return getDestinatario();
    }
    
    public String verConteudo(){
        return getConteudo();
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public WTTextual getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(WTTextual destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
}
