package com.example.appnhacvuong.Service;

import com.example.appnhacvuong.Model.Album;
import com.example.appnhacvuong.Model.Baihat;
import com.example.appnhacvuong.Model.Playlist;
import com.example.appnhacvuong.Model.Quangcao;
import com.example.appnhacvuong.Model.Theloaitrongngay;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {
    @GET("song_banner.php")
    Call<List<Quangcao>> GetDataBanner();

    @GET("playlistforcurrentday.php")
    Call<List<Playlist>> GetPlaylistCurrentDay();

    @GET("chudevatheloaitrongngay.php")
    Call<Theloaitrongngay> GetCategoryMusic();

    @GET("albumhot.php")
    Call<List<Album>> GetAlbumHot();

    @GET("baihatduocthich.php")
    Call<List<Baihat>> GetBaiHatHot();
}
