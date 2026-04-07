package ua.university.task1;

import java.util.List;

class LoadResult {
    List<Payment> payments;
    int invalidLines;

    LoadResult(List<Payment> payments, int invalidLines) {
        this.payments = payments;
        this.invalidLines = invalidLines;
    }
}
