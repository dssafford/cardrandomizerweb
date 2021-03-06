package com.doug.domain;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

/**
 * Created by jt on 12/14/15.
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String username;

    @Transient
    private String password;

    private String encryptedPassword;
    private Boolean enabled = true;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable
//    // ~ defaults to @JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "user_id"),
//    //     inverseJoinColumns = @joinColumn(name = "role_id"))
//    private List<Role> roles = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    //    public String getEncryptedPassword() {
//        return encryptedPassword;
//    }
//
//    public void setEncryptedPassword(String encryptedPassword) {
//        this.encryptedPassword = encryptedPassword;
//    }
//
//    public Boolean getEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(Boolean enabled) {
//        this.enabled = enabled;
//    }

//    public List<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }
//
//    public void addRole(Role role){
//        if(!this.roles.contains(role)){
//            this.roles.add(role);
//        }
//
//        if(!role.getUsers().contains(this)){
//            role.getUsers().add(this);
//        }
//    }
//
//    public void removeRole(Role role){
//        this.roles.remove(role);
//        role.getUsers().remove(this);
//    }

}
