package pl.danielzurek.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "role")
public class Role {
    private Long id;
    private String name;
    private Set<User> usersRoles;

    public Role() {
    }

    public Role(Long id, String name, Set<User> usersRoles) {
        this.id = id;
        this.name = name;
        this.usersRoles = usersRoles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsersRoles() {
        return usersRoles;
    }

    public void setUsersRoles(Set<User> usersRoles) {
        this.usersRoles = usersRoles;
    }

    @Override
    public String toString() {
        return name;
    }
}
