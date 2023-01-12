package org.example.Bcrypt;

import org.springframework.stereotype.Service;
public interface EncryptHelper {
    String encrypt(String password);

    boolean ismatch(String password, String hashed);
}
