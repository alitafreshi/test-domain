package com.alitafreshi.subvention_history

import com.alitafreshi.subvention_result.InquirySubventionPaymentResultResponse
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse

data class InquirySubventionPaymentHistoryDto(
    val BankAccountNumber: String,
    val NationalID: String,
    val YearOfBirth: String
)


data class InquirySubventionPaymentHistoryResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: InquirySubventionPaymentResultResponse
)