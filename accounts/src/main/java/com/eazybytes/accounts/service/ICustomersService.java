package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerCompleteDetailsDto;

public interface ICustomersService {

    /**
     *
     * @param mobileNumber-Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    CustomerCompleteDetailsDto fetchCustomerDetails(String mobileNumber);
}
