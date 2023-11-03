package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Custom")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Custom extends BaseEntity {
    @Column
    private String nameCustom;
}
