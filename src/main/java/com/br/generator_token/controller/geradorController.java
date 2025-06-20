package com.br.generator_token.controller;

import com.br.generator_token.Service.TokenService;
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

		return ResponseEntity.ok(response);
	}


}
