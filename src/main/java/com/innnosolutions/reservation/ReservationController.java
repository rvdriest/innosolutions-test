package com.innnosolutions.reservation;

import jdk.jfr.ContentType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @GetMapping("/reservation")
    public Reservation getReservation() {
        return new Reservation(1, "First reservation");
    }
}
