package org.generation.demodb.users;
import javax.persistence.*;
@Entity
@Table(name="usuario")
public class user { // Plan Old Java Object - POJO
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

        public user(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }//constructor
    public user(){}//default constructor

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

    public String getPassword() {
        return password;
    }//getPassword

    public void setPassword(String password) {
        this.password = password;
    }//setPassword

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }//toString
}//class
