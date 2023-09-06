import java.time.LocalDate;

public abstract class BasePessoa extends BaseDadosComuns{

        protected String nome;
        protected String telefone;
        protected String email;
        protected String usuario;
        
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getUsuario() {
            return usuario;
        }
        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public BasePessoa(int codigo, LocalDate data, String nome, String telefone, String email, String usuario) {
            super(codigo, data);
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.usuario = usuario;
        }

            
    }