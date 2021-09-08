package com.arcanesecurity.nasalighting.services

import com.arcanesecurity.nasalighting.model.LightingStrike
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * NASA endpoints
 *
 * Put all Nasa endpoints here
 *
 */
interface NasaEndpoints {

    /**
     * Enpoint /lights
     * Returns all light for specific city/country/dateTime we can change that for any other parameters.
     *
     * Filter by query parameters
     * @param city String -> city for research
     * @param country String -> country for research
     * @param date String -> date for research
     */
    @GET("/lights")
    suspend fun fetchLights(
        @Query("city") city: String,
        @Query("country") country: String,
        @Query("date") date: String
    ): Response<List<LightingStrike>>

}