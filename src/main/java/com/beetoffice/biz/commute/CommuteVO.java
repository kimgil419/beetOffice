package com.beetoffice.biz.commute;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CommuteVO {

    @Getter @Setter
    String in_time, out_time, user_name, searchCondition, searchKeyword;
    @Getter @Setter
    String user_id;
	


}
