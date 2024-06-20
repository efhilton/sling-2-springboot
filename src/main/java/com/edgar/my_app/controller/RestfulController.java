package com.edgar.my_app.controller;

import com.edgar.my_app.model.MyConfigs;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "My First Attempt at a REST Controller")
public class RestfulController {

    @GetMapping(value = "/api/byQueryParam", produces = "application/json")
    @Operation(summary = "Say hello", description = "Says hello, but argument passed as query")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success!"),
            @ApiResponse(responseCode = "500", description = "Boo!!TT!")
    })
    public ResponseEntity<MyConfigs> byQueryParam(@RequestParam String whom) {
        MyConfigs c = new MyConfigs();
        c.setShortName("hello " + whom + "!!!");
        return ResponseEntity.ok(c);
    }

    @GetMapping(value = "/api/byRequestBody", produces = "application/json")
    @Operation(summary = "Say hello", description = "Says hello, but argument passed as a request body")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success!"),
            @ApiResponse(responseCode = "500", description = "Boo!!!")
    })
    public ResponseEntity<MyConfigs> byRequestBody(
            @RequestBody(required = false)
            String whom) {
        MyConfigs c = new MyConfigs();
        c.setShortName("hello " + whom + "!!!");
        return ResponseEntity.ok(c);
    }

    @GetMapping(value = "/api/byPathVariable/{id}", produces = "application/json")
    @Operation(summary = "Say hello", description = "Says hello, but argument passed as a path variable")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success!"),
            @ApiResponse(responseCode = "500", description = "Boo!!!")
    })
    public ResponseEntity<MyConfigs> byPathVariable(@PathVariable("id") String whom) {
        MyConfigs c = new MyConfigs();
        c.setShortName("hello " + whom + "!!!");
        return ResponseEntity.ok(c);
    }
}
