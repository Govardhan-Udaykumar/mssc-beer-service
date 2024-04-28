package org.beginnertoexpert.msscbeerservice.services.services;

import org.beginnertoexpert.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void update(UUID beerId, BeerDto beerDto);

    void deleteBeerById(UUID beerId);
}
