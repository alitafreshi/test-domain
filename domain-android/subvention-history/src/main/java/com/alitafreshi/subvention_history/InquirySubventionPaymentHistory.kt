package com.alitafreshi.subvention_history

import android.os.Parcelable
import com.alitafreshi.subvention_result.InquirySubventionPaymentResult
import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse
import ir.tafreshiali.ayan_core.util.AppDialogState
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class InquirySubventionPaymentHistory(
    val Inquiry: @RawValue InquiryHistoryResponse,
    val Result: InquirySubventionPaymentResult
) : Parcelable

