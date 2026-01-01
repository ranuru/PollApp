package com.app.PollApp.model;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vote {
    
    private Instant publishedAt;
}
