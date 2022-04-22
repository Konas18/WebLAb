package com.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRsDto {
    private boolean verification;
}
