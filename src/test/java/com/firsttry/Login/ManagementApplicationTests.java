package com.firsttry.Login;

import com.firsttry.Login.model.SignUpRequest;
import com.firsttry.Login.service.AuthService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ManagementApplicationTests {
	@Test
	public void testSignUp() {
		// Prepare test data
		SignUpRequest signUpRequest = new SignUpRequest();

		// Call the service method
		AuthService authService = null;
		ResponseEntity<String> response = authService.signUp();

		// Assert the response
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertEquals("Signup successful", response.getBody());
	}


}
