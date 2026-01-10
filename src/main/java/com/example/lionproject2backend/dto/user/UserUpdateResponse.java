package com.example.lionproject2backend.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateResponse {

    private Long id;
    private String nickname;
    private String introduction;
}
