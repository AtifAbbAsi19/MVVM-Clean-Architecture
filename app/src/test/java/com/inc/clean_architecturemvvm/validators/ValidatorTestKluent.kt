package com.inc.clean_architecturemvvm.validators

import com.inc.clean_architecturemvvm.utils.Constants
import com.inc.clean_architecturemvvm.utils.Validator
import org.amshove.kluent.internal.assertEquals
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test


class ValidatorTestKluent {

    private var validator: Validator? = null

    @Before //This is executed before the @Test executes
    fun setUp() {
        validator = Validator()
        println("Ready for testing")
    }


    @After //This is executed after the @Test executes
    fun tearDown() {
        validator = null
        println("Done with testing")
    }


    @Test
    fun `API KEY VALIDATOR VALID,True ASSERTION`() {
        val result = validator?.isValidApiKey(Constants.REQUEST_PARAMS_MOCK.API_KEY_MOCK.key)
        assertEquals(true, result)
    }


    @Test
    fun `API KEY VALIDATOR INVALID,False ASSERTION`() {
        val result = validator?.isValidApiKey(Constants.INVALID_KEY)
        assertEquals(false, result)
    }

    @Test
    fun `CHECK CORRECT SESSION,VALID ,TRUE ASSERTION`() {
        val result = validator?.isForAllSession(Constants.REQUEST_PARAMS_MOCK.SESSION_MOCK.key)
        assertEquals(true, result)
    }

    @Test
    fun `CHECK CORRECT SESSION,INVALID ,FALSE ASSERTION`() {
        val result = validator?.isForAllSession(Constants.INVALID_SECTION)
        assertEquals(false, result)
    }

    @Test
    fun `CHECK NUMBER OF  PAGINATION,VALID ,TRUE ASSERTION`() {
        val result = validator?.isForSevenPages(Constants.REQUEST_PARAMS_MOCK.PAGE_MOCK.key)
        assertEquals(true, result)
    }

    @Test
    fun `CHECK NUMBER OF  PAGINATION,INVALID ,FALSE ASSERTION`() {
        val result = validator?.isForSevenPages(Constants.INVALID_PAGE)
        assertEquals(false, result)
    }


    @Test
    fun `CHECK BASE URL,VALID ,TRUE ASSERTION`() {
        val result = validator?.isValidBaseUrl(Constants.REQUEST_PARAMS_MOCK.API_KEY_MOCK.key)
        assertEquals(true, result)
    }

    @Test
    fun `CHECK BASE URL,INVALID ,FALSE ASSERTION`() {
        val result = validator?.isValidBaseUrl(Constants.INVALID_BASE_URL)
        assertEquals(false, result)
    }







}