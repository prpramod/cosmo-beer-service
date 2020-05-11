package cosmo.springframework.cosmobeerservice.web.mappers;


import cosmo.springframework.cosmobeerservice.domain.Beer;
import cosmo.springframework.cosmobeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);

}
