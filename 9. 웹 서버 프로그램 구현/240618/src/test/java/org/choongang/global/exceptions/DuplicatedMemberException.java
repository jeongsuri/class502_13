package org.choongang.global.exceptions;


public class DuplicatedMemberException extends BadRequestException{
    public DuplicatedMemberException() {
        super("이미 가입된 회원입니다.");
    }
}

