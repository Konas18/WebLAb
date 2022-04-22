package com.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetUserByIdRsDto {
//    private Integer id;
//    private String name;
//    private Integer age;
//    private String email;
    private User user;
}
