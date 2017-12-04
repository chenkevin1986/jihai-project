package com.jihai.mengmian.error.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;

/**
 * Created by qinhong on 2017/3/10.
 */
@Controller
public class HttpErrorController implements ErrorController{
    private final static String ERROR_PATH = "/error";


    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
