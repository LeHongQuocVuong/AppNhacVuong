package com.example.appnhacvuong.Service;

import com.example.appnhacvuong.Model.Playlist;
import com.example.appnhacvuong.Model.Quangcao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {
    @GET("song_banner.php")
    Call<List<Quangcao>> GetDataBanner();

    @GET("playlistforcurrentday.php")
    Call<List<Playlist>> GetPlaylistCurrentDay();
}
