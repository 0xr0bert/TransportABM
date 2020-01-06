package io.github.ragreener1.transportabm.model

import sim.engine.*

/**
 * This is the state of the simulation
 *
 * @param seed This is the RNG seed
 * @constructor This creates a new TransportSimState
 */
class TransportSimState(seed: Long) : SimState(seed)

/**
 * This is the entry point of the simulation if running on the command line
 */
fun main(args: Array<String>) {
    SimState.doLoop(TransportSimState::class.java, args)
    System.exit(0)
}