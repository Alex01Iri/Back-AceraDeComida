package org.generation.demodb.seller;
import javax.persistence.*;
@Entity
@Table(name="vendedor")
public class seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="id", unique = true, nullable = false)
    private Long id;
    @Column(name="user", nullable = false)
    private String username;
    @Column(name="email",nullable = false)
    private  String email;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="titular", nullable = false)
    private String titular;
    @Column(name="telefono", nullable = false)
    private String telefono;
    @Column(name="localizacion", nullable = false)
    private String localizacion;
    public seller(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.titular = titular;
        this.telefono = telefono;
        this.localizacion = localizacion;
    }//constructor
    public seller(){}//default constructor
    public Long getId() {
        return id;
    }//getId
    public void setId(Long id) {
        this.id = id;
    }//setId
    public String getUsername() {
        return username;
    }//getUserName
    public void setUsername(String username) {
        this.username = username;
    }//setUserName
    public String getEmail() { return email; }//getEmail
    public void setEmail(String email) {this.email = email; }//setEmail
    public String getPassword() { return password; }//getPassword
    public void setPassword(String password) {
        this.password = password;
    }//setPassword
    public String getTitular() { return titular;}//getTitular
    public void setTitular(String titular) {this.titular = titular;}//setTitular
    public String getTelefono() {return telefono;}//getTelefono
    public void setTelefono(String telefono) {this.telefono = telefono;}//setTelefono
    public String getLocalizacion() {return localizacion;}//getLocalizacion
    public void setLocalizacion(String localizacion) {this.localizacion = localizacion;}//setLocalizacion
    @Override
    public String toString() {
        return "seller{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", titular='" + titular + '\'' +
                ", telefono='" + telefono + '\'' +
                ", localizacion='" + localizacion + '\'' +
                '}';
    }//toString
}//class


