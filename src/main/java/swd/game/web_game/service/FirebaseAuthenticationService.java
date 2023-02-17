//package swd.game.web_game.service;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseAuthException;
//import com.google.firebase.auth.FirebaseToken;
//import jakarta.annotation.PostConstruct;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Service;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Collections;
//import java.util.List;
//
//@Service
//public class FirebaseAuthenticationService {
//
//    private FirebaseApp firebaseApp;
//
//    @PostConstruct
//    public void initialize() throws IOException {
//        FileInputStream serviceAccount = new FileInputStream("path/to/firebase-credentials.json");
//
//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//
//        firebaseApp = FirebaseApp.initializeApp(options);
//    }
//
//    public Authentication getAuthentication(HttpServletRequest request) {
//        String token = request.getHeader("Authorization");
//        if (token != null && token.startsWith("Bearer ")) {
//            token = token.substring(7);
//            try {
//                FirebaseToken decodedToken = FirebaseAuth.getInstance(firebaseApp).verifyIdToken(token);
//                String email = decodedToken.getEmail();
//                if (email != null) {
//                    List<GrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
//                    return new UsernamePasswordAuthenticationToken(email, null, authorities);
//                }
//            } catch (FirebaseAuthException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
//}
