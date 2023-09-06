import java.time.LocalDate;

public class Passageiro extends BaseLogin {

    private String NumeroCartao;
    private String documento;
    private String registro;    
    private String usuario;
    
    public String getNumeroCartao() {
        return NumeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        NumeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Passageiro(int codigo, LocalDate data, String nome, String telefone, String email, String usuario,
            String senha, String usuario2, String numeroCartao, String documento, String registro, String usuario3) {
        super(codigo, data, nome, telefone, email, usuario, senha, usuario2);
        NumeroCartao = numeroCartao;
        this.documento = documento;
        this.registro = registro;
        usuario = usuario3;
    }
    
     
}
