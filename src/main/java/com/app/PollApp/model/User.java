package com.app.PollApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class User {
    
    @JsonIgnore
    private Long id;
    
    private String username;
    private String email;
}
