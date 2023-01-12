package org.example.Bcrypt;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class Encrypt implements EncryptHelper{
    @Override
    public String encrypt(String password) {return BCrypt.hashpw(password, BCrypt.gensalt());}

    @Override
    public boolean ismatch(String password, String hashed) {return BCrypt.checkpw(password, hashed);}
}
