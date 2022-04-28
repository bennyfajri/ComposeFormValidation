package com.drsync.composeformvalidation.domain.use_case

data class ValidationResult(
    val successfull: Boolean,
    val errorMessage: String? = null
)