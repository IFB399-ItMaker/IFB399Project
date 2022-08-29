package com.example.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SetSessionUtil {
    public static void setSession(HttpServletRequest request, String SessionName, String SessionValue) {
        HttpSession session = request.getSession();
        session.setAttribute(SessionName,SessionValue);
    }
}
