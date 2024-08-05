package softuni.web.project.util;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class JwtServiceImpl implements JwtService {
    @Override
    public String generateToken(String userId, Map<String, Object> claims) {
        return null;
    }
}
