package task2_compositionVSinherit;

public class LoggingCheckoutServiceInherited extends CheckoutService {
    @Override
    public String checkout(String orderId) {
        System.out.println("Start checkout");
        String result = super.checkout(orderId);
        System.out.println("End checkout");
        return result;
    }
}

/*
* Проблеми наслідування:
* Жорстка прив’язка до реалізації батьківського класу.
* Якщо CheckoutService змінить поведінку або стане final, усе ламається.
* Порушення інкапсуляції
* Дочірній клас залежить від внутрішньої логіки super.Неможливо легко підмінити іншу реалізацію */
