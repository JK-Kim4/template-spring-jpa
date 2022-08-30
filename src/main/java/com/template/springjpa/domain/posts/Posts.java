package com.template.springjpa.domain.posts;

import com.template.springjpa.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //h2 db
    //@GeneratedValue(strategy = GenerationType.IDENTITY)  //mysql
    private Long id;

    @Column(nullable = false)
    private boolean useYn;

    @Column(nullable = false)
    private int code;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(length = 255)
    private String attachedFileName;

    @Column(length = 255)
    private String attachedFileUrl;

    @Column
    private int appendUser;


    @Builder
    public Posts(boolean useYn, int code, String title,
                 String content, String attachedFileName,
                 String attachedFileUrl, int appendUser){

        this.useYn = useYn;
        this.code = code;
        this.title = title;
        this.content = content;
        this.attachedFileName = attachedFileName;
        this.attachedFileUrl = attachedFileUrl;
        this.appendUser = appendUser;
    }


    public void update(boolean useYn, int code, String title,
                       String content, String attachedFileName,
                       String attachedFileUrl, int appendUser){

        this.useYn = useYn;
        this.code = code;
        this.title = title;
        this.content = content;
        this.attachedFileName = attachedFileName;
        this.attachedFileUrl = attachedFileUrl;
        this.appendUser = appendUser;
    }

}
