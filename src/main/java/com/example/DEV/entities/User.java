package com.example.DEV.entities;


import javax.persistence.*;

@Entity
@Table(name =  "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private String name;
    private String email;

    @ManyToOne // MUITOS PARA UM
    @JoinColumn(name = "department_id")
    private Departmant departmant; // PARA ESTANCIAR DEPARATAMENTO EM USUARIO

    public  User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departmant getDepartmant() {
        return departmant;
    }

    public void setDepartmant(Departmant departmant) {
        this.departmant = departmant;
    }
}
