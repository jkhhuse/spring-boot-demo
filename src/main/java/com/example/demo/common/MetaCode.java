package com.example.demo.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetaCode implements Serializable {
  private static final long serialVersionUID = 1402564660203580251L;

  private String code;
  private String message;
}
