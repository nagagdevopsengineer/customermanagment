package com.arrivnow.customermanagement.customermanagement.domain;


import com.arrivnow.customermanagement.customermanagement.controller.CLientController;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name="contractor")
public class Contractor
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    @Column(name="id")
    private Long id;
    @Column(name="email")
    private String email;
    @Column(name="uuid")
    private UUID uuid;
    @Column(name="isApproved")
    private Boolean isApproved;
    @Column(name="pancard")
    private String panCard;
    @Column(name="name")
    private String name;
    @Column(name="gstnumber")
    private String gst_Number;
    @Column(name="gsturl")
    private String gst_url;
    @Column(name="contactnumber")
    private String contactNumber;

    /*@OneToMany(mappedBy = "contractor",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<ClientContractors> clientContractors;*/



}
