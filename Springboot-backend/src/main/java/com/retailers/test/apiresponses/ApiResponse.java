package com.retailers.test.apiresponses;

public class ApiResponse<T> {
    private boolean success;
    private int statusCode;
    private String message;
    private T data;

    // Default Constructor for all
    public ApiResponse(boolean success, int stscode, String msg, T data){
        this.success = success;
        this.statusCode = stscode;
        this.message = msg;
        this.data = data;
    }

    // constructor without data       |       mainly used to send error responses
    public ApiResponse(boolean success, int stscode, String msg){
        this.success = success;
        this.statusCode = stscode;
        this.message = msg;
    }

    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
