package com.komi.project.model;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "commission_templates")
public class CommissionTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID commission_template_id;
    private String title;
    private BigDecimal price;
    private RequestState requestState;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @OneToMany(mappedBy = "commissionTemplate")
    private List<Request> requests;

    public UUID getCommission_template_id() {
        return commission_template_id;
    }

    public void setCommission_template_id(UUID commission_template_id) {
        this.commission_template_id = commission_template_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
