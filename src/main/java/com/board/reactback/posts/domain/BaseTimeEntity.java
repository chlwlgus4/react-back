package com.board.reactback.posts.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우 필드들도 컬럼으로 인식하도록 함
@EntityListeners(AuditingEntityListener.class) //BaseTimeEntity클래스에 Auditing 기능을 포함시킴
public class BaseTimeEntity {
    @CreatedDate //엔티티가 생성되어 저장될 때 시간이 자동저장됨
    private LocalDateTime createdDate;

    @LastModifiedDate //조회한 엔티티의 값을 변견할 때 자동으로 저장됨
    private LocalDateTime modifiedDate;
}
