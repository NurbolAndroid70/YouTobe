package com.example.youtobe.data.api
import com.example.youtobe.data.model.BaseResponse
import com.example.youtobe.data.model.VideoModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApiService {
    @GET("playlists")
    suspend fun getPlaylists(
        @Query("part") part: String,
        @Query("key") apiKey: String,
        @Query("channelId") channelId: String,
        @Query("maxResults") maxResults: Int
    ):Response<BaseResponse>

    @GET("playlistItems")
    suspend fun getPlaylistItems(
        @Query("part") part: String,
        @Query("key") apiKey: String,
        @Query("playlistId") playlistId: String,
        @Query("maxResults") maxResults: Int
    ):Response<VideoModel>

}