package com.innnosolutions.reservation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Reservation {
    private final long id;
    private final String content;
}
