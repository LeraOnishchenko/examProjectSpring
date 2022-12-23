package com.exam.springexamproject.service;

public interface Encryptor {
    String encode(String strToEncrypt);

    boolean matches(CharSequence rawString, String encodedString);
}
