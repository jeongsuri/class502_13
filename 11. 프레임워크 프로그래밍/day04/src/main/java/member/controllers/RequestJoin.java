package member.controllers;

import lombok.Data;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String passwordConfirm;
    private String userName;
    private boolean agree;
}
