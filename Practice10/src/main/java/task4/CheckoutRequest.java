package task4;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutRequest {
    private UserDto user;
    private Price price;
    private String orderNotes;
}
