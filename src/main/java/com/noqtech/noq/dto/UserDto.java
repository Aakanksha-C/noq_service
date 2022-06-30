package com.noqtech.noq.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String fullName;
    private String emailId;
    private String password;
    private String phone;
    private String message;
}
