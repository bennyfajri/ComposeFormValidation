package com.drsync.composeformvalidation.domain.use_case

class ValidatePassword {

    fun execute(password: String): ValidationResult {
        if (password.length < 8) {
            return ValidationResult(
                successfull = false,
                errorMessage = "the password needs to consist of at least 8 character"
            )
        }
        val containsLettersAndDigits = password.any{ it.isDigit()} &&
                password.any { it.isLetter() }
        if(!containsLettersAndDigits) {
            return ValidationResult(
                successfull = false,
                errorMessage = "The  password needs to contains at least one letter and digit"
            )
        }
        return ValidationResult(
            successfull = true,
        )
    }
}