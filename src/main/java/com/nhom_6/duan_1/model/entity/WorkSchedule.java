package com.nhom_6.duan_1.model.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="WorkSchedule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkSchedule extends BaseEntity{
    @Column
    private String nameWorkSchedule;
    @Column
    private Date createAt;
    @Column
    private Date endAt;
    @Column
    private String description;
    @Column
    private String status;

    @ManyToOne
    @JsonBackReference
    private ShiftAssignment shiftAssignment;
}
