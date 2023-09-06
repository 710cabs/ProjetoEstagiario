import java.time.LocalDate;

public class Funcionario extends BaseLogin{

    private String contaCorrente;
    private String registro;
    private String cracha;
    private String senha;
    
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Funcionario(int codigo, LocalDate data, String nome, String telefone, String email, String usuario,
            String senha, String usuario2, String contaCorrente, String registro, String cracha, String senha2) {
        super(codigo, data, nome, telefone, email, usuario, senha, usuario2);
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
        senha = senha2;
    }

    
    
}
    
    
    

