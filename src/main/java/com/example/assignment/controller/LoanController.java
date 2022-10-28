package com.example.assignment.controller;

import com.example.assignment.collection.Loan;
import com.example.assignment.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService service;

    //create

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Loan createLoan(@RequestBody Loan loan) {
        return service.addLoan(loan);
    }

    // get all
    @GetMapping
    public List<Loan> getLoans() {
        return service.getLoans();
    }

    //get loan by id
    @GetMapping("/{loanId}")
    public Loan getLoanById (@PathVariable String loanId) {
        return service.getLoanById(loanId);
    }

    //get loan by userid
    @GetMapping("/user/{userId}")
    public List<Loan> getLoanByUserId (@PathVariable String userId) {
        return service.getLoanByUserId(userId);
    }

//    //get loan by status
//    @GetMapping("/status/{loanStatus}")
//    public List<Loan> getLoanByStatus (@PathVariable String loanStatus) {
//        return service.LoanByStatus(loanStatus);
//    }

    //update all loan details
    @PutMapping
    public Loan updateLoan (@RequestBody Loan loan) {
        return service.updateLoanDetails(loan);
    };
}
