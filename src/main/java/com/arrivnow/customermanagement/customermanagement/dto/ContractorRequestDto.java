package com.arrivnow.customermanagement.customermanagement.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.UUID;

@Component
@Data
public class ContractorRequestDto
{
    private String email;
    private String phonenumber ;
    private UUID clientuuid;
    private Boolean isApproved;
    private String panCard;
    private String name;
    private String gst_Number;
    private String gst_url;

}
