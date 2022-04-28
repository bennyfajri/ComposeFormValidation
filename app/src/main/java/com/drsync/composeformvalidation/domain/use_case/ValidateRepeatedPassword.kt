package com.drsync.composeformvalidation.domain.use_case

import android.util.Patterns

class ValidateRepeatedPassword {

    fun execute(password: String, repeatedPassword : String): ValidationResult {
        if (password != repeatedPassword) {
            return ValidationResult(
                successfull = false,
                errorMessage = "Repeated password not matches"
            )
        }
        return ValidationResult(
            successfull = true,
        )
    }
}