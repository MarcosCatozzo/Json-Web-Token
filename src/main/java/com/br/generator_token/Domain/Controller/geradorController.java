package com.br.generator_token.Domain.Controller;

import com.br.generator_token.Domain.Service.TokenService;
import com.br.generator_token.Domain.dto.DetalheToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gerar")
public class geradorController {

	@Autowired
	private TokenService tokenService;

	@GetMapping
	public ResponseEntity geradorToken() {

		var response = tokenService.gerarToken();

		return ResponseEntity.ok(new DetalheToken(response));
	}
}
