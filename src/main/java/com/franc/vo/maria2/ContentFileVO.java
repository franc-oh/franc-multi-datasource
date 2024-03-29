package com.franc.vo.maria2;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode(of = "file_seq")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContentFileVO {
    private Long file_seq;
    private Long content_seq;
    private String file_path;
    private String file_name;
    @Builder.Default
    private Character use_yn = 'Y';
    private Integer content_order;
    private LocalDateTime created;
}
