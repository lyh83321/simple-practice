package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BankAccountDemo;
import com.example.demo.service.BankAccountDemoService;

@RestController
public class Controller {

	@Autowired
	private BankAccountDemoService bankAccountDemoService;
	
	@RequestMapping("/demo")
	public String Demo() {
		return "Demo";
	}
	
	@RequestMapping("/demo/query/{bankId}")
	public ResponseEntity<BankAccountDemo> getBank(@PathVariable Integer bankId) {
		BankAccountDemo bank = bankAccountDemoService.getBankAccountById(bankId);

        if (bank != null) {
            return ResponseEntity.status(HttpStatus.OK).body(bank);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
