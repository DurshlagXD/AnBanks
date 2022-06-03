package com.example.anbanks

import retrofit2.Response

class Repositoriy {
    suspend fun getprivat(): Response<privat>{
        return RetrofitInstance.api.getNalprivat()
    }
}
