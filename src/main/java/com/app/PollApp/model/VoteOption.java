package com.app.PollApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VoteOption {
    
    private String caption;
    private int presentationOrder;
}
