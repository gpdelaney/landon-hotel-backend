package com.linkedinlearning.reactivespring.controller;

import com.linkedinlearning.reactivespring.model.Reservation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ReservationResource.ROOM_V_1_RESERVATION)
@CrossOrigin
public class ReservationResource {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    @GetMapping(path = "{roomId}")
    public Mono<Reservation> getReservationById(@PathVariable String roomId) {
        return null;
    }

    @PostMapping(path = "")
    public Mono<Reservation> createReservation(@RequestBody Mono<Reservation> reservation) {
        return null;
    }

    @PutMapping(path = "{roomId}")
    public Mono<String> updatePrice(@RequestBody Mono<Reservation> reservation, @PathVariable String roomId){
        return Mono.just("{}");
    }

    @DeleteMapping(path = "{roomId}")
    public Mono<Boolean> deleteReservation(@PathVariable String roomId){
        return Mono.just(false);
    }
}
