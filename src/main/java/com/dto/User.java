package com.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class User {
    @NonNull
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String login;
    private String password;
}
