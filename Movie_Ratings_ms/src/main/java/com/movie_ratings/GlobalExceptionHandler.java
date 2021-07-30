package com.movie_ratings;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.OffsetDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public Meta handleRunTImeException(Throwable error){
        return Meta.builder().time(OffsetDateTime.now()).errorCode("MOV-1234").message(error.getMessage()).build();
    }
}

@Data
@Builder
class Meta{
    OffsetDateTime time;
    String errorCode;
    Integer httpStatus;
    String message;
}
