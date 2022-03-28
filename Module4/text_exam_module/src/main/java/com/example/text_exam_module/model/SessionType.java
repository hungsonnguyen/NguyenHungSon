package com.example.text_exam_module.model;


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
    private Set<Session> sessions;

    public SessionType(int id, String name, Set<Session> sessions) {
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

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }
}
