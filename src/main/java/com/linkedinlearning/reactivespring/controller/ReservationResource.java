package com.linkedinlearning.reactivespring.controller;

import com.linkedinlearning.reactivespring.model.Reservation;
import com.linkedinlearning.reactivespring.service.ReservationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ReservationResource.ROOM_V_1_RESERVATION)
@CrossOrigin
@RequiredArgsConstructor
public class ReservationResource {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    private final ReservationService reservationService;

    @GetMapping(path = "{roomId}")
    public Mono<Reservation> getReservationById(@PathVariable String roomId) {
        return reservationService.getReservation(roomId);
    }

    @PostMapping(path = "")
    public Mono<Reservation> createReservation(@RequestBody Mono<Reservation> reservation) {
        return reservationService.createReservation(reservation);
    }

    @PutMapping(path = "{roomId}")
    public Mono<Reservation> updatePrice(@RequestBody Mono<Reservation> reservation, @PathVariable String roomId){
        return reservationService.updateReservation(roomId, reservation);
    }

    @DeleteMapping(path = "{roomId}")
    public Mono<Boolean> deleteReservation(@PathVariable String roomId){
        return reservationService.deleteReservation(roomId);
    }
}
