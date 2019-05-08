package com.checkout.sdk.api

import com.checkout.sdk.request.CardTokenizationRequest
import com.checkout.sdk.response.CardTokenizationResponse
import com.checkout.sdk.utils.Environment
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST


interface TokenApi {
    @POST(Environment.TOKEN_PATH)
    fun getTokenAsync(@Header("Authorization") authorization: String, @Body cardTokenizationRequest: CardTokenizationRequest): Deferred<Response<CardTokenizationResponse>>
}