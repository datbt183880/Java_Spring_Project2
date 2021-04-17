package com.example.restController_pathVariable_requestBody;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApiExceptionHandler {

    //Tất cả các Exception không được khai báo sẽ được xử lý tại đây

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage handleAllException(Exception exception, WebRequest request){
        // nơi diễn ra quá trình kiểm soát lỗi
        return new ErrorMessage(1000, exception.getLocalizedMessage());
    }

    //IndexOutOfBoundsException sẽ được xử lý riêng tại đây
    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    public ErrorMessage TodoException(Exception exception, WebRequest request){
        return new ErrorMessage(10100, "Đối tượng không tồn tại");
    }
}
