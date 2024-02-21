package com.hruser.hruser.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="tb_user_role", //quando temos uma associação muitos para muitos, precisamos criar um outra tabela
    joinColumns = @JoinColumn(name = "user_id"),//id's das tabelas principais na tabela de relacionamento
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    @Getter
    Set<Role> roles = new HashSet<>();
}
