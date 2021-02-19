package com.uditagarwal;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class State {
    private PrinterType nextToPrint;

    public State(@NonNull final PrinterType nextToPrint) {
        this.nextToPrint = nextToPrint;
    }
}
