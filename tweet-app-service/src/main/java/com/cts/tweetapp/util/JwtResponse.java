package com.cts.tweetapp.util;


import com.cts.tweetapp.model.User;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JwtResponse {
    private User user;
    private String loginStatus;
    private String token;
}