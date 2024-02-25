package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "CustomerCompleteDetails",
        description = "Schema to hold Customer,Account,Cards and Loans information")
public class CustomerCompleteDetailsDto {

    @Schema(description = "Details of the Customer")
    private CustomerDto customerDto;
    @Schema(description = "Account details of the Customer")
    private AccountsDto accountsDto;
    @Schema(description = "Cards details of the Customer")
    private CardsDto cardsDto;
    @Schema(description = "Loans details of the Customer")
    private LoansDto loansDto;

}
