package springmvc.jstl.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public enum ErrorCode {
    FILE_SIZE(500, "J001", "File Size Not Accptable");

    private final String code;
    private final String message;
    private final int status;


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    ErrorCode(final int status, final String code, final String message) {
        this.status = status;
        this.message = message;
        this.code = code;
    }
}
