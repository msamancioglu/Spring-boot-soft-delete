package com.example.demo.model;





import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "courses")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SQLDelete(sql = "UPDATE courses SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")  // Global filter for soft delete
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(
            description = "id of the course",
            name = "id",
            type = "int",
            example = "1")
    private int id;

    @Schema(
            description = "name of the course",
            name = "name",
            type = "string",
            example = "MATEMATİK")
    private String name;

    @Schema(
            description = "price of the course",
            name = "price",
            type = "double",
            example = "200")
    private double price;
    
    @Schema(
            description = "deleted of the course",
            name = "deleted",
            type = "boolean",
            example = "false")
    
    
//     @SQLRestriction("c1_0.deleted = 'false'")
        @ColumnDefault("false")    
        private boolean deleted;

}