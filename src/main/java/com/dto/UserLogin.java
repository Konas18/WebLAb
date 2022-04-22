package com.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class UserLogin {
    private String email;
    private String login;
    private String Password;
}
