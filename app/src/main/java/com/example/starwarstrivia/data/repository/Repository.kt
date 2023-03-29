package com.example.starwarstrivia.data.repository

import com.example.starwarstrivia.data.model.people.PeopleModel
import com.example.starwarstrivia.data.model.planets.PlanetsModel
import com.example.starwarstrivia.data.model.species.SpeciesModel
import com.example.starwarstrivia.data.model.starships.StarshipsModel
import com.example.starwarstrivia.data.model.vehicles.VehiclesModel

interface Repository {

    suspend fun getPeople(): PeopleModel

    suspend fun getSpecies(): SpeciesModel

    suspend fun getPlanets(): PlanetsModel

    suspend fun getStarships(): StarshipsModel

    suspend fun getVehicles(): VehiclesModel
}