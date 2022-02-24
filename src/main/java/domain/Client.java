package domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getGst_Number() {
        return gst_Number;
    }

    public void setGst_Number(String gst_Number) {
        this.gst_Number = gst_Number;
    }

    public String getGst_url() {
        return gst_url;
    }

    public void setGst_url(String gst_url) {
        this.gst_url = gst_url;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
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


}
