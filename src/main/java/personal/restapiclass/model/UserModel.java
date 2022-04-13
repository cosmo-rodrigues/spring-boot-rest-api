package personal.restapiclass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class UserModel {

    @Id
    public Integer cod;

    @Column(nullable = false, length = 50)
    public String nome;

    @Column(nullable = false, length = 20)
    public String login;

    @Column(nullable = false, length = 20)
    public String pass;

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLongin() {
        return login;
    }

    public void setLongin(String longin) {
        this.login = longin;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
