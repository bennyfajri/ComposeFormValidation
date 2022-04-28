package com.drsync.composeformvalidation.domain.use_case

import android.util.Patterns

class ValidateEmail {

    fun execute(email: String): ValidationResult {
        if (email.isBlank()) {
            return ValidationResult(
                successfull = false,
                errorMessage = "The email can't be blank"
            )
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successfull = false,
                errorMessage = "That's not a valid email"
            )
        }
        return ValidationResult(
            successfull = true,
        )
    }
}