package gKoder.loginRegistertest.registration.token;

import gKoder.loginRegistertest.user.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final TokenRepository tokenRepository;

    public void saveConfirmationToken(ConfirmationToken token) {
        tokenRepository.save(token);
    }

    public Optional<ConfirmationToken> getToken(String token) {
        return tokenRepository.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return tokenRepository.updateConfirmedAt(
                token, LocalDateTime.now());
    }
    public Optional<ConfirmationToken> getLatestTokenForUser(User user) {
        List<ConfirmationToken> tokens = tokenRepository.findLatestTokenForUser(user, LocalDateTime.now());
        return tokens.isEmpty() ? Optional.empty() : Optional.of(tokens.get(0));
    }
}
