package net.nemerosa.ontrack.rundata

import junit.framework.Assert.fail
import org.junit.Test

class POCTests {

    @Test
    fun ok() {
    }

    @Test
    fun failure() {
        fail("Testing")
    }

    @Test
    fun error() {
        throw IllegalStateException("Failure")
    }

}