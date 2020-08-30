package com.gomsang.cbs.api

import com.gomsang.cbs.responses.DiasterMessageRow
import com.gomsang.cbs.responses.SafeKoreaResponse
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SafeKoreaApi {
    @FormUrlEncoded
    @POST("disasterBreaking/showList2.do")
    fun showList(@Field("rows") rows: Int, @Field("page") page: Int): Single<SafeKoreaResponse<DiasterMessageRow?>?>?
}