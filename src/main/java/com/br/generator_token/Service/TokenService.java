package com.br.generator_token.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

	@Value("${API.SPRING-LOCALHOST-SECRET}")
	private String SECRET;

	private static final String ISSUER = "";

	public String gerarToken() {
		try {
			var algoritmo = Algorithm.HMAC256(SECRET);
			return JWT.create()
					.withIssuer(ISSUER)
					.sign(algoritmo);
		} catch (JWTCreationException exception) {
			throw new RuntimeException("erro ao gerar token jwt", exception);
		}
	}
}
