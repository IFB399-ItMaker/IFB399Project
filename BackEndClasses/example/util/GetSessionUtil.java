package com.example.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class GetSessionUtil {
    public static String getSession(HttpServletRequest request, String sessionName) {
        HttpSession session = request.getSession();
        String sessionValue = (String) session.getAttribute(sessionName);
        return sessionValue;
    }
}
