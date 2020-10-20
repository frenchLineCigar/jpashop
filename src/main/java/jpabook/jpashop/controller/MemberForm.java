package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 회원 가입 > 폼 객체 (유효성 검사)
 */
@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 입니다")
    private String name; //이름은 필수값

    private String city;
    private String street;
    private String zipcode;


}