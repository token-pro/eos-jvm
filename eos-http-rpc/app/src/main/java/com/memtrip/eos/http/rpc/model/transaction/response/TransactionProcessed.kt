package com.memtrip.eos.http.rpc.model.transaction.response

data class TransactionProcessed(
    val id: String,
    val receipt: TransactionParentReceipt,
    val elapsed: Int,
    val net_usage: Int,
    val scheduled: Boolean,
    val action_traces: List<TransactionActionTrace>,
    val except: Any?)