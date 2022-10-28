package com.example.assignment.service;

import com.example.assignment.collection.Loan;
import com.example.assignment.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LoanService {
    @Autowired
    private LoanRepository LoanRepo;

    // CRUD Operations methods are here......

    //Create Operation
    public Loan addLoan(Loan loan) {
        loan.setLoanId(UUID.randomUUID().toString().split("-")[0]);
        return LoanRepo.save(loan);
    }

    //Read Operation

    //Get all loan_info
    public List<Loan> getLoans() {
        return LoanRepo.findAll();
    }

    //Get loans by loanId
    public Loan getLoanById(String loanId) {
        return LoanRepo.findById(loanId).get();
    }

    //Get loans by userId
    public List<Loan> getLoanByUserId(String userId) {
        return LoanRepo.findByUserId(userId);
    }

    //Get loans by status
    public List<Loan> LoanByStatus(String loanStatus) {
        return LoanRepo.findLoansByLoanStatus(loanStatus);
    }


    //Update Operations
    public Loan updateLoanDetails(Loan loanRequest) {
        Loan existingLoan = LoanRepo.findById(loanRequest.getLoanId()).get();
        existingLoan.setAmount(loanRequest.getAmount());
        existingLoan.setLoanStatus(loanRequest.getLoanStatus());
        existingLoan.setType(loanRequest.getType());
        existingLoan.setDescription(loanRequest.getDescription());
        existingLoan.setGuaranteeNIC(loanRequest.getGuaranteeNIC());
        existingLoan.setGuaranteeName(loanRequest.getGuaranteeName());
        existingLoan.setInstallments(loanRequest.getInstallments());
        existingLoan.setInterestRate(loanRequest.getInterestRate());
        existingLoan.setUserId(loanRequest.getUserId());
        return LoanRepo.save(existingLoan);
    }

    //update loan by id
    public Loan updateById (String loanId, Loan loanData) {
        loanData.setLoanId(loanId);
        return LoanRepo.save(loanData);
    }


}
