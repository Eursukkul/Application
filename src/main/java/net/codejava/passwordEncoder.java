package net.codejava;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordEncoder {
	public static void main(String[] arg) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "may2020";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
	}

}
