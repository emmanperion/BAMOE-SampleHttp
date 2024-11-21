package org.acme.pru_one.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LogService {
    public void log(String msg) {
        System.out.println("************* Log");
        System.out.println(""+ msg);
        System.out.println("************* Log");
    }
}
