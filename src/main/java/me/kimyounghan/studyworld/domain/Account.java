package me.kimyounghan.studyworld.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id")
// 연관관계가 복잡해질 때 EqualsAndHashCode에서 서로 다른 연관관계를 계속해서 순환 참조하느라 무한 루프가 발생하고
// 결국엔 StackOverFlow가 발생할 수 있다.
@Builder @AllArgsConstructor @NoArgsConstructor
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String email; // String은 기본적으로 varchar(255)에 매핑됨

    @Column(unique = true)
    private String nickname;

    private String password;

    private boolean emailVerified;

    private String emailCheckToken;

    private LocalDateTime joinedAt;

    private String bio;

    private String url;

    private String occupation;

    private String location;

    @Lob // varchar(255)보다 길어질 때
    @Basic(fetch = FetchType.EAGER) // 바로바로 가져옴.
    private String profileImage;

    private boolean studyCreatedByEmail;

    private boolean studyCreatedByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

    private boolean studyUpdatedByEmail;

    private boolean studyUpdatedByWeb;

}
