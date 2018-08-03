package com.revature.filter;

public class SecurityConstants {
	public static final long EXPIRATION_TIME = 3_600_000;
	public static final String SECRET = "SECRET_SALT";
	public static final String HEADER_STRING = "Authorization";
	public static final String PREFIX = "Bearer ";
}
