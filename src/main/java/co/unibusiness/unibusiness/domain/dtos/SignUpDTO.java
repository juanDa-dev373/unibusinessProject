package co.unibusiness.unibusiness.domain.dtos;

public record SignUpDTO(
        String name,
        String nickname,
        String email,
        String photo,
        String password,
        String city

) {
}
