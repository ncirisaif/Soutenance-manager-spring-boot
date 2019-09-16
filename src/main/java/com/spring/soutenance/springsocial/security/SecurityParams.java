package com.spring.soutenance.springsocial.security;


/**
 * @author Nciri Sayf
 */

public interface SecurityParams {
    public static final String JWT_HEADER_NAME="Authorization";
    public static final String SECRET="nciri.saif";
    public static final long EXPIRATION=30; // 10 days
    public static final String HEADER_PREFIX="Bearer ";
    public static final String SIGN_UP_URL = "/users/sign-up";
    }


