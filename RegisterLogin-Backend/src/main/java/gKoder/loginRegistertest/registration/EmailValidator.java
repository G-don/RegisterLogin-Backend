package gKoder.loginRegistertest.registration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.util.function.Predicate;

@Service
@Component
public class EmailValidator implements Predicate<String> {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    @Override
    public boolean test(String email) {
        return email.matches(EMAIL_REGEX);
    }
}
