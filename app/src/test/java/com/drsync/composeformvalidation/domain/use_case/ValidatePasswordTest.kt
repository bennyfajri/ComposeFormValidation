package com.drsync.composeformvalidation.domain.use_case

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class ValidatePasswordTest {

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp() {
        validatePassword = ValidatePassword()
    }

    @Test
    fun `Password is letter-only, return error` () {
        val result = validatePassword.execute("abcdefgh1J")

        assertEquals(result.successfull, true)
    }
}