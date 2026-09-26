package com.banking.transactionservice.Entity;

/**
 * Tranaction Lifecycle Flow:
 *
 * PENDING -> PROCESSING -> COMPLETED (clean transaction)
 *                       -> PENDING_VERIFICATION (suspicious detected)
 *                                 -> COMPLETED (verified)
 *                                 -> FLAGGED (SAGA REFUND)
 *                       -> FAILED
 *                       -> FLAGGED
 */

public enum TransactionStatus {
    PENDING,
    PROCESSING,
    PENDING_VERIFICATION,
    FAILED,
    FLAGGED
}
