package cosmo.springframework.cosmobeerservice.web.controller;

import cosmo.springframework.cosmobeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    // Get Beer by Id
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

      // todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    // Create new bear
    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        // todo impl
        return new ResponseEntity(beerDto,HttpStatus.CREATED);

    }

    // Update beer

    @PutMapping
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beerDto){

        // todo impl
      return new ResponseEntity((HttpStatus.NO_CONTENT));

    }


}
