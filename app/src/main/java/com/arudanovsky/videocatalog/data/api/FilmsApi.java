package com.arudanovsky.videocatalog.data.api;


import com.arudanovsky.videocatalog.data.dto.DataListTO;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public interface FilmsApi {
    String URL = "https://gist.githubusercontent.com/numbata/5ed307d7953c3f7e716f/raw/b7887adc444188d8aa8e61d39b82950f28c03966";

    @GET(URL + "/movies.json")
    Observable<DataListTO> getFilms();
}
