package be.vives.jarne.assignment_7.network

import be.vives.jarne.assignment_7.data.BoredActivityDto
import retrofit2.http.GET

interface BoredApiService {
    @GET("random")
    suspend fun getRandomActivity(): BoredActivityDto
}
