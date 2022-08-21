package com.nalsuwailem.be1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/admin/")
@Tag(name = "Admin", description = "Business Admin Services")
public class AdminController {
    @GetMapping("/hello")
    @Operation(security = @SecurityRequirement(name = "bearerAuth"), summary = "API service summarization", description = "API service description")
    public ResponseEntity<?> getHelloWorld(){
        return ResponseEntity.status(HttpStatus.OK).body("Admin - Hello World from BE 1");
    }
}
