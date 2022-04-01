package com.alitafreshi.subvention_result

data class PaymentResponse(
    val Amount: Long,
    val Bank: String,
    val Category: String,
    val Count: Long,
    val Month: String,
    val OrderID: Long,
    val SubsidyTypeID: Long,
    val SubsidyTypeTitle: String,
    val Turn: String
)
