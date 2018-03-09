package avaliaçãofinal;
import java.io.IOException;
public class WTDisconnectedException extends IOException{
        public String getMessage(){
        return "Usuário offline. Tente novamente mais tarde.";
    }
}

