package co.unibusiness.unibusiness.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String name;
    private String password;
    private String nickname;
    private String email;
    private StateRecord state;
    private StateRecord login;
}
