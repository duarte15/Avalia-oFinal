package avaliaçãofinal;
public class MsgInvalidaExpection extends RuntimeException {
    public String getMessage(){
        return "Mensagem inexistente ou com conteúdo inválido";
    }
}
