package springmvc.jstl.common;

import org.apache.tomcat.util.http.fileupload.impl.SizeLimitExceededException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(SizeLimitExceededException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> sizeLimitExceptionHandle(){
        ErrorResponse response = ErrorResponse.of(ErrorCode.FILE_SIZE);

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
