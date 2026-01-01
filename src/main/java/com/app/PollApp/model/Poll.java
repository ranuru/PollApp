package com.app.PollApp.model;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Poll {

    private String question;
    private Instant publishedAt;
    private Instant validUntil;

}
