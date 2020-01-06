package io.github.ragreener1.transportabm.model

import kotlin.test.Test
import kotlin.test.assertNotNull

class TransportAgentTest {
    @Test fun TestTransportAgentIsCreated() {
        val agent = TransportAgent()
        assertNotNull(agent, "Agent not created")
    }
}
