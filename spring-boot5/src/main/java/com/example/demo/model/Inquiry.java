package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Inquiry {

    //必須入力。60文字まで
    @NotBlank
    @Size(max=60)
    private String name;

    // 必須入力、Email形式であること、254文字まで
    @NotBlank
    @Email
    @Size(max=254)
    private String email;

    // 必須入力、半角文字かハイフン
    @NotBlank
    @Pattern(regexp = "[0-9]*")
    private String phoneNumber;

    // 必須入力、1000円以上、数値へ変換
    @NotNull
    @Min(1000)
    @NumberFormat(pattern = "#,###")
    private BigDecimal price;

    // 必須入力、日付へ変換
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate paymentDeadline;




}
