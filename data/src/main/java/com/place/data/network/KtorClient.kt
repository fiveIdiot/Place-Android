package com.place.data.network

import android.content.ContentValues
import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.HttpResponseValidator
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.ConnectionPool
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object KtorClient {
    @OptIn(ExperimentalSerializationApi::class)
    @Singleton
    @Provides
    fun provideKtorHttpClient(
        //localAuthDataSource: LocalAuthDataSource, // 로컬 DB 추가시 재도입
    ): HttpClient {
        val client = HttpClient(OkHttp) {
            install(Logging) {
                level = LogLevel.ALL
                logger = object : Logger {
                    override fun log(message: String) {
                        Log.d(ContentValues.TAG, message)
                    }
                }
            }
            engine {
                config {
                    followRedirects(true)
                    connectTimeout(timeout = 60, unit = TimeUnit.SECONDS)
                    connectionPool(
                        ConnectionPool(
                            maxIdleConnections = 10,
                            keepAliveDuration = 5,
                            timeUnit = TimeUnit.MINUTES
                        )
                    )
                }
            }

            install(ContentNegotiation) {
                json(
                    Json {
                        encodeDefaults = true
                        prettyPrint = true
                        isLenient = true
                        explicitNulls = false
                        ignoreUnknownKeys = true
                    }
                )
            }

            defaultRequest {
                url {
                    protocol = URLProtocol.HTTPS
                    host = "PRODUCT_URL"
                }
                // 로컬 DB 추가시 재 도입
//                headers {
//                    val userToken = runBlocking { //localAuthDataSource.getToken() }
//                    if (userToken.isNotEmpty()) {
//                        append(HttpHeaders.ContentType, ContentType.Application.Json)
//                        append(HttpHeaders.Authorization, "Bearer $userToken")
//                    }
//                }
            }
            HttpResponseValidator {
                validateResponse { response ->
                    if (response.status.value !in 200..299) {
                        //throw response.body<>()
                    }
                }
            }
        }
        return client
    }
}