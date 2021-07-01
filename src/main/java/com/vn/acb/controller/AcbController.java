package com.vn.acb.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vn.acb.common.APIResponse;
import com.vn.acb.dto.PaymentVisaDebitDto;
import com.vn.acb.dto.StepVerificationDto;

@RestController
public class AcbController {
	
	/**
	 * return total cards that are already opened by user
	 * @param id
	 * @return
	 */
	private APIResponse getTotalCardsAlreadyCreatedByUserId(int id) {
		
		return new APIResponse();
	}
	
	/**
	 * return total cards that can open by user
	 * @param id
	 * @return
	 */
	private APIResponse getTotalCardsCanCreateByUser(int id) {
		
		return new APIResponse();
	}
	
	/**
	 * return all of verification's method that are register by user 
	 * @param id
	 * @return
	 */
	private APIResponse get2StepVerification(int id) {
		
		return new APIResponse();
	}
	
	private APIResponse isBlackList(int id) {
		
		return new APIResponse();
	}
	
	@GetMapping("users/{id}/cards")
	public APIResponse getListCardsByUserId(@PathVariable int id) {
		
		return new APIResponse();
	}
	
	@GetMapping("/cards/fee-open-new-card")
	public APIResponse getFeeOpenNewCard() {
		
		return new APIResponse();
	}
	
	@GetMapping("/cards/annual-fee")
	public APIResponse getCardAnnualFee() {
		
		return new APIResponse();
	}

	@GetMapping("/users/{id}/check-criteria-create-visadebit")
	public APIResponse checkCriteriaCreateVisaDebit(@PathVariable int id) {
		
		getTotalCardsAlreadyCreatedByUserId(0);
		get2StepVerification(0);
		getTotalCardsCanCreateByUser(0);
		isBlackList(0);
		return new APIResponse();
	}
	
	@GetMapping("/users/{id}/account-balance")
	public APIResponse getAccountBalanceByUser(@PathVariable int id) {
		
		return new APIResponse();
	}
	
	/**
	 * submit payment once user register new visa debits  
	 * @param id
	 * @return
	 */
	@PostMapping("/cards/visa-debit")
	public APIResponse submitPaymentVisaDebit(@RequestBody PaymentVisaDebitDto paymentVisaDebitDto) {
		
		return new APIResponse();
	}
	
	@PostMapping("/users/{id}/do-step-verification")
	public APIResponse doStepVerification(@PathVariable int id) {
		
		return new APIResponse();
	}
	
	@PostMapping("/users/{id}/check-step-verification")
	public APIResponse submitStepVerification(@PathVariable int id, @RequestBody StepVerificationDto paymentVisaDebitDto) {
		
		return new APIResponse();
	}
	
}
