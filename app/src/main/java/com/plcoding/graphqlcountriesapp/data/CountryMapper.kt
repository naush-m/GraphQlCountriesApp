package com.plcoding.graphqlcountriesapp.data

import com.plcoding.CountriesQuery
import com.plcoding.graphqlcountriesapp.domain.SimpleCountry

fun CountriesQuery.Country.toSimpleCountry(): SimpleCountry {
    return SimpleCountry(code = code, name = name, emoji = emoji, capital = capital ?: "No Capital")
}