package id.kalviansofian.belajarretrofitbasic.rest;

import id.kalviansofian.belajarretrofitbasic.model.Items;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by root on 27/05/17.
 */

public interface ApiInterface {

    @GET("{periode}/dayli.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);



}

