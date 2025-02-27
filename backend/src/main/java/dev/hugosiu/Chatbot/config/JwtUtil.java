package dev.hugosiu.Chatbot.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
  @Value("${jwt.secret-key}")
  private String secretKey;

  public String generateToken(String username) {
    return Jwts.builder()
        .setSubject(username)
        .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
        .signWith(SignatureAlgorithm.HS256, secretKey)
        .compact();
  }

  public boolean validateToken(String token, String username){
    final String extractUsername = extractUsername(token);
    return extractUsername.equals(username) && !isTokenExpired(token);
  }

  public boolean isTokenExpired(String token){
    return extractExpiration(token).before(new Date());
  }

  public Date extractExpiration (String token){
    return Jwts.parser().setSigningKey(secretKey).parseClaimsJwt(token).getBody().getExpiration();
  }

  public String extractUsername (String token){
    return Jwts.parser().setSigningKey(secretKey).parseClaimsJwt(token).getBody().getSubject();
  }
}
