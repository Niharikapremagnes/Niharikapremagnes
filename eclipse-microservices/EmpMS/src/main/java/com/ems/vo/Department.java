package com.ems.vo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	 private @Getter @Setter Long departmentId;
	 private @Getter @Setter String departmentName;

}
