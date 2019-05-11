package com.bb.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
