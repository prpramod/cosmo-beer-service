package cosmo.springframework.cosmobeerservice.bootstrap;

import cosmo.springframework.cosmobeerservice.domain.Beer;
import cosmo.springframework.cosmobeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

  private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadBeerObjects();

    }

    private void loadBeerObjects() {

        if(beerRepository.count() ==0  ){

            beerRepository.save(Beer.builder()
                          .beerName("MyBeer")
                          .beerStyle("IPA")
                          .quantityToBrew(200)
                          .minOnHand(12)
                          .upc(323232323232L)
                    .price(new BigDecimal("12.99"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("Pale Ale")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(8171712712L)
                    .price(new BigDecimal("10.99"))
                    .build());

        }

        System.out.println("Total beers"+beerRepository.count());
    }
}
