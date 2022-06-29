package com.badbones69.crazycrates.support.structures.interfaces

import org.bukkit.Location

interface SpiralControl {

    fun getSpiralLocationClockwise(center: Location): ArrayList<Location>

    fun getSpiralLocationCounterClockwise(center: Location): ArrayList<Location>

}