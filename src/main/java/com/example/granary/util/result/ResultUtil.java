package com.example.granary.util.result;

public class ResultUtil {
    public static <T> Result<T> createResult(int code, String msg, T data){
        return new Result<>(code, msg, data);
    }
}
