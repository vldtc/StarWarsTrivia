package com.example.starwarstrivia.data.remote

import com.example.starwarstrivia.data.model.people.PeopleModel
import com.example.starwarstrivia.data.model.planets.PlanetsModel
import com.example.starwarstrivia.data.model.species.SpeciesModel
import com.example.starwarstrivia.data.model.starships.StarshipsModel
import com.example.starwarstrivia.data.model.vehicles.VehiclesModel
import retrofit2.http.GET

interface ApiRequest {

    @GET(ApiDetails.PEOPLE)
    suspend fun getPeople(): PeopleModel

    @GET(ApiDetails.SPECIES)
    suspend fun getSpecies(): SpeciesModel

    @GET(ApiDetails.PLANETS)
    suspend fun getPlanets(): PlanetsModel

    @GET(ApiDetails.STARSHIPS)
    suspend fun getStarships(): StarshipsModel

    @GET(ApiDetails.VEHICLES)
    suspend fun getVehicles(): VehiclesModel

}