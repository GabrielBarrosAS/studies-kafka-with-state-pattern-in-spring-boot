package com.example.carInventoryControl.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.carInventoryControl.model.states.AbstractState;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Car {

    @Id
    private String id;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private AbstractState state;

}
