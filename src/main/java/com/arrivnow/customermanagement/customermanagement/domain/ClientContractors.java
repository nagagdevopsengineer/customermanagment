package com.arrivnow.customermanagement.customermanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Table(name="client_contractors")
@Entity
@Data
public class ClientContractors
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
    @ManyToOne
    @JoinColumn(name="contractor_id")
    private Contractor contractor;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @Column(name="uuid")
    private UUID uuid;
}
