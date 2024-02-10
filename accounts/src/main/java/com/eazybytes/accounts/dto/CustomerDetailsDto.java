package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "CustomerDetails", description = "Schema to hold Customer and Account information")
public class CustomerDetailsDto {

    private CustomerDto customerDto;
    private AccountsDto accountsDto;
}
