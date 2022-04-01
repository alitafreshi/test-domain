package com.alitafreshi.subvention_result

import android.os.Parcelable
import ir.tafreshiali.ayan_core.date_time.DateTimeResponse
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class InquirySubventionPaymentResult(
    val AccountNumber: String,
    val AccountRegistrationDate: @RawValue DateTimeResponse,
    val Bank: String,
    val CardNumber: String,
    val FullName: String,
    val LastAmountOfPayments: Long,
    val LastPayment: PaymentResponse,
    val Payments: List<PaymentResponse>,
    val PersonCount: String,
    val TotalAmountOfPayments: Long,
    val TotalNumberOfPayments: Long
):Parcelable
