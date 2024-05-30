package Servidor.Entitites;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Company extends User {
    public String Ramo;
    public String Description;
    public String CNPJ;
    public String CorporateName;

    public Company(String email, String password, String ramo,
                   String description, String cnpj, String corporateName) {
        this.Email = email;
        this.Password = password;
        this.Ramo = ramo;
        this.Description = description;
        this.CNPJ = cnpj;
        this.CorporateName = corporateName;
    }

    public Company( String email, String password) {
        super( email, password);
    }

    public Company(){}

    public static Company Entity(ResultSet rs) throws SQLException {
        String email = rs.getString("Email");
        String password = rs.getString("Senha");
        String ramo = rs.getString("Ramo");
        String description = rs.getString("Descricao");
        String cnpj = rs.getString("CNPJ");
        String corporateName = rs.getString("Razao_Social");
        return new Company( email, password,ramo, description, cnpj, corporateName);
    }
}
