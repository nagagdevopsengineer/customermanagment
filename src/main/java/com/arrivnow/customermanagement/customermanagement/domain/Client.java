package com.arrivnow.customermanagement.customermanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name="client")
public class Client
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

    @Override
    public String toString() {
        return "Client{" +
            "id=" + id +
            ", email='" + email + '\'' +
            ", uuid=" + uuid +
            ", isApproved=" + isApproved +
            ", panCard='" + panCard + '\'' +
            ", gst_Number='" + gst_Number + '\'' +
            ", gst_url='" + gst_url + '\'' +
            ", contactNumber='" + contactNumber + '\'' +

            '}';
    }

    @Column(name="gstnumber")
    private String gst_Number;
    @Column(name="gsturl")
    private String gst_url;
    @Column(name="contactnumber")
    private String contactNumber;

  /*  @OneToMany(mappedBy = "client",cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<ClientContractors> clientcontractors;*/



}
