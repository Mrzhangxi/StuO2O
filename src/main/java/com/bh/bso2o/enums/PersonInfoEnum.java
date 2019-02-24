package com.bh.bso2o.enums;

public enum PersonInfoEnum {
    customer(1, "顾客"),
    boss(2, "店主"),
    root(3, "管理员"),
    NORMAL(100, "正常"),
    DELETED(101, "注销"),
    ;

    private Integer code;
    private String msg;

    PersonInfoEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static PersonInfoEnum getUserType(int value) {
        for (PersonInfoEnum personInfoEnum : PersonInfoEnum.values()) {
            if (value == personInfoEnum.getCode()) {
                return personInfoEnum;
            }
        }
        return null;
    }

    /**
     * 根据String类型的描述获取对应的Code
     * @param msg
     * @return
     */
    public static PersonInfoEnum getUserCode(String msg) {
        for (PersonInfoEnum personInfoEnum : PersonInfoEnum.values()) {
            if (msg.equals(personInfoEnum.getMsg())) {
                return personInfoEnum;
            }
        }
        return null;
    }
}
