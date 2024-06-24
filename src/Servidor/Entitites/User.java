package Servidor.Entitites;

public class User extends BaseEntity {
    public String Name;
    public String Email;
    public String Password;
    public String Competence;
    public String Experience;

    public User(String name, String email, String password, String competence, String experience) {
        this.Name = name;
        this.Email = email;
        this.Password = password;
        this.Competence = competence;
        this.Experience = experience;
    }

    public User(String email, String password) {
        this.Email = email;
        this.Password = password;
    }

    public User() {

    }
}
