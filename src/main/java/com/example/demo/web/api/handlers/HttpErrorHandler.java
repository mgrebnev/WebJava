package com.example.demo.web.api.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class HttpErrorHandler implements ErrorController {
    @Autowired
    private ErrorAttributes errorAttributes;

    @RequestMapping(value = "/error")
    public Map<String,Object> error(HttpServletRequest request) {
        return errorAttributes.getErrorAttributes(new ServletRequestAttributes(request),true);
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}