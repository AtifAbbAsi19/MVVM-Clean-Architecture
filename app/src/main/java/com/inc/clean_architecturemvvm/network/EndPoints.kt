package com.inc.clean_architecturemvvm.network

interface EndPoints {


    companion object {

        const val ARTICLE_REPO_ENDPOINT = "/svc/mostpopular/v2/mostviewed"
        const val ARTICLE_REPO_URL =
            "http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=GtbLhSNJWqJmQLO7fqXly8qKKPpxxHQr"

    }

     //398fb883-ee95-46e4-87c1-a78733e8cb6c , app ID
    //cD4SggNUMe4mCf9A  , //Secret Id
}