import java.time.LocalDate;

public abstract class BaseLogin extends BasePessoa{

    protected String senha;
    protected String usuario;
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public BaseLogin(int codigo, LocalDate data, String nome, String telefone, String email, String usuario,
            String senha, String usuario2) {
        super(codigo, data, nome, telefone, email, usuario);
        this.senha = senha;
        usuario = usuario2;
    }

    
}
