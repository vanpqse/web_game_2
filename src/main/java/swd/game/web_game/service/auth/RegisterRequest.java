package swd.game.web_game.service.auth;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RegisterRequest {
    private String username;
    private String password;
    private String firstname;
    private String lastname;


}
