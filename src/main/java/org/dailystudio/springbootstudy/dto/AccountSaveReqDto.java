package org.dailystudio.springbootstudy.dto;

import lombok.Getter;
import org.dailystudio.springbootstudy.domain.Account;

@Getter
public class AccountSaveReqDto {
    private String email;
    private String password;
    private String name;
}
