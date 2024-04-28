package org.beginnertoexpert.msscbeerservice.mappers;

import org.beginnertoexpert.msscbeerservice.domain.Beer;
import org.beginnertoexpert.msscbeerservice.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
