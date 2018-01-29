package api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ray Thony on 29/01/2018.
 */


public class Cliente {
    public interface PopularTracks {
        @GET("popular")
        Call<List<PopularTracks>> GetPopularTracks();


    }
}
