package com.shopbase.shop.dto.exceptions;

public class CustomException extends RuntimeException{
    CustomException(String message){
        super(message);
    }
}
