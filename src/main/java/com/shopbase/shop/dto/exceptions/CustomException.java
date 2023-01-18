package com.shopbase.shop.dto.exceptions;

public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
