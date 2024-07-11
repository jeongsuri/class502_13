package org.choongang.global.validaotrs;

public interface Validator<T> {
    void check(T form);
}
