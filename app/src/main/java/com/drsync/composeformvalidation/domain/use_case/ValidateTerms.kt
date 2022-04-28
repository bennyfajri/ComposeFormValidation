package com.drsync.composeformvalidation.domain.use_case

import android.util.Patterns

class ValidateTerms {

    fun execute(acceptedTerms: Boolean): ValidationResult {
        if (!acceptedTerms) {
            return ValidationResult(
                successfull = false,
                errorMessage = "Please accept the terms"
            )
        }
        return ValidationResult(
            successfull = true,
        )
    }
}