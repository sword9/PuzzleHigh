package com.example.zsystudio.puzzlehigh.util.JsonBeans;

/**
 * Created by liaoyt on 16-5-1.
 */
public class RegisterResponse {
    /**
     * success : 1
     * message : User successfully created.
     */

    private int success;
    private String message;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
