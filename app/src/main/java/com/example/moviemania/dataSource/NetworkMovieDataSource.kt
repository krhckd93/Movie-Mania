package com.example.moviemania.dataSource

import com.example.moviemania.app.model.SearchResult
import io.reactivex.Single

class NetworkMovieDataSource: MovieDataSourceI {

    override fun getMovies(): Single<SearchResult> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}