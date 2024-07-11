package org.choongang.global.validaotrs;

public interface RequiredValidator {
    default void checkRequired(String str, RuntimeException e){
        if(str == null || str.isBlank()){
            throw e;
        }
    }

    default void checkTrue(boolean result, RuntimeException e){
        if(!result){
            throw e;
        }
    }
}
