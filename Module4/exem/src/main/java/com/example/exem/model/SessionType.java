package com.example.exem.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ssesion_type")
public class SessionType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(mappedBy = "sessionType")
    private Set<TranSaction> sessions;

    public SessionType(int id, String name, Set<TranSaction> sessions) {
        this.id = id;
        this.name = name;
        this.sessions = sessions;
    }

    public SessionType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TranSaction> getSessions() {
        return sessions;
    }

    public void setSessions(Set<TranSaction> sessions) {
        this.sessions = sessions;
    }
}
