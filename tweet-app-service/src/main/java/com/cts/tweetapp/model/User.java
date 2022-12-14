package com.cts.tweetapp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Document(collection = "users")
public class User {

    @Transient
    public static final String SEQUENCE_NAME="users_sequence";

    @Id
    private int id;

    @Indexed(unique = true)
    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @Indexed(unique = true)
    @NonNull
    private String email;

    @NonNull
    private long contactNumber;

}
