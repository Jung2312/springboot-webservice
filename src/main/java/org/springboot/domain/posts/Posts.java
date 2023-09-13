package org.springboot.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springboot.domain.BaseTimeEntity;

@Getter // entity 클래스의 경우 setter 선언 X, 명확하게 구분이 어려워 지기 때문
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 엔티티 클래스를 request, response 클래스로 사용 하면 안됨
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // setter 대신 값을 받음, 생성자의 역할
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
