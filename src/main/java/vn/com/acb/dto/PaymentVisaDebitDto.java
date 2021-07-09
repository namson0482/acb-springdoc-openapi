package vn.com.acb.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PaymentVisaDebitDto {

	private int userId;
	
	private long money;
}
