package com.example.anbanks

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
        @GET("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5")
        suspend fun getNalprivat(): Response<privat>
    }