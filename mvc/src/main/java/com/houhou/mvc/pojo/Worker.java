package com.houhou.mvc.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Worker {
    private Integer wid;
    private String wname;
    private Integer wage;
    private String wsex;
    private String wwork;
}
