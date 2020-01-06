package io.github.ragreener1.transportabm.model

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertEquals

class TransportSimStateTest {
    @Test fun TestSimStateIsCreated() {
        val simState = TransportSimState(1)
        assertNotNull(simState, "SimState not created")
    }
}
