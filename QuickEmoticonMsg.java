package avaliaçãofinal;
//public class QuickEmoticonMsg extends Mensagempackage avaliaçãofinal;
public class QuickEmoticonMsg extends Mensagem{
    public final String SMILE_FACE = ":D";
    public final String SAD_FACE = ":/";
    public final String CRYING_FACE = "T-T";
    public final String SURPRISE_FACE = ":O";
    public final String HEART = "<3";
    public QuickEmoticonMsg(String remetente, WTTextual destinatario, int opcao) {
        super(remetente, destinatario);
        setConteudo(selecionarOpc(opcao));
    }
    private String selecionarOpc(int opcao){
        if(opcao == 1){
            return SAD_FACE;
        }
        else if(opcao==2){
            return CRYING_FACE;
        }
        else if(opcao==3){
            return SURPRISE_FACE;
        }
        else if(opcao==4){
            return HEART;
        }
        else{
            return SMILE_FACE;
        }
    }
}
