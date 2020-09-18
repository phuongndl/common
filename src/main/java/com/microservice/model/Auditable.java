package com.microservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class Auditable {

    @CreatedDate
    @JsonIgnore
    private Instant createdDate;

    @LastModifiedDate
    @JsonIgnore
    private Instant modifiedDate;

    @LastModifiedBy
    @JsonIgnore
    private String lastModifiedBy;

    @CreatedBy
    @JsonIgnore
    private String initBy;
}
