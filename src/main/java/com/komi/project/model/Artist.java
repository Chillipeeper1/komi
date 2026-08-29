package com.komi.project.model;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID artist_id;
    private String username;
    private String email;
    private DateFormat registerDate;

    @OneToMany(mappedBy = "artist")
    private List<CommissionTemplate> commissionTemplate;

    public UUID getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(UUID artist_id) {
        this.artist_id = artist_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DateFormat getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(DateFormat registerDate) {
        this.registerDate = registerDate;
    }
}
