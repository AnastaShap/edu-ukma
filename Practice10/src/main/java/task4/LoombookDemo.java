package task4;

public class LoombookDemo {
    public static void main(String[] args) {
        UserDto user = new UserDto();
        user.setUsername("developer_ua");

        Price price = new Price(99.99, "UAH"); // Об'єкт незмінний

        CheckoutRequest request = CheckoutRequest.builder()
                .user(user)
                .price(price)
                .orderNotes("Доставити після 18:00")
                .build();

        System.out.println(request);
    }

}
