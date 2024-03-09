package web.hw1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.hw1.models.OperationModel;

@RestController
@Validated
@RequestMapping("/calc/")
public class IndexController {

    @GetMapping("{operator}/{op1}/{op2}")
    public ResponseEntity<String> calculate(
            @PathVariable String operator,
            @PathVariable Integer op1,
            @PathVariable Integer op2
    ) {
        try {
            return ResponseEntity.ok(new OperationModel(operator, op1, op2).operate());
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.badRequest().body("Invalid operator is provided!!");
        } catch (ArithmeticException exception) {
            return ResponseEntity.badRequest().body("Operation is not possible!!");
        }
    }
}
